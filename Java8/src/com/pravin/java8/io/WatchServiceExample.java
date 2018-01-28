package com.pravin.java8.io;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class WatchServiceExample {

    private final WatchService watcher;
    private final Map<WatchKey, Path> keys;

    public WatchServiceExample(Path dir) throws IOException {
	this.watcher = FileSystems.getDefault()
		.newWatchService();
	this.keys = new HashMap<>();
	walkAndRegisterDirectories(dir);
    }

    private void walkAndRegisterDirectories(Path start) throws IOException {
	Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
	    @Override
	    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		registerDirectory(dir);
		return super.preVisitDirectory(dir, attrs);
	    }
	});
    }

    protected void registerDirectory(Path dir) throws IOException {
	WatchKey key = dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
		StandardWatchEventKinds.ENTRY_MODIFY);
	keys.put(key, dir);
    }

    private void processEvents() {
	for (;;) {
	    WatchKey key;
	    try {
		key = watcher.take();
		Path dir = keys.get(key);
		if (dir == null) {
		    System.out.println("WatchKey is not recognized!!");
		    continue;
		}

		for (WatchEvent<?> event : key.pollEvents()) {
		    @SuppressWarnings("rawtypes")
		    WatchEvent.Kind kind = event.kind();
		    @SuppressWarnings("unchecked")
		    Path name = ((WatchEvent<Path>) event).context();
		    Path child = dir.resolve(name);

		    System.out.format("%s: %s\n", event.kind()
			    .name(), child);

		    if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
			if (Files.isDirectory(child)) {
			    try {
				walkAndRegisterDirectories(child);
			    } catch (IOException e) {
				System.out.println(e);
			    }
			}
		    }
		}
		boolean valid = key.reset();
		if (!valid) {
		    keys.remove(key);
		    if (keys.isEmpty()) {
			break;
		    }
		}

	    } catch (InterruptedException e) {
		System.out.println(e);
	    }
	}
    }

    public static void main(String[] args) {
	Path dir = Paths.get(".");
	try {
	    new WatchServiceExample(dir).processEvents();
	} catch (IOException e) {
	    System.out.println(e);
	}
    }
}
