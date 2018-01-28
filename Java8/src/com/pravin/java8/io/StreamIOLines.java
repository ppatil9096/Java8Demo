package com.pravin.java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamIOLines {
    public static void main(String[] args) {
	Path path = Paths.get("/home/pp/Desktop/Untitled Document 1");
	try (Stream<String> lines = Files.lines(path)
		.filter(s -> s.contains("call"))
		.onClose(() -> System.out.println("stream and file are closed"))) {
	    lines.findFirst()
		    .ifPresent(System.out::println);
	} catch (IOException e) {
	    System.out.println(e);
	}
    }
}
