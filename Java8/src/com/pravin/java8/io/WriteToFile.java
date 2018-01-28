package com.pravin.java8.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) {
	Path paths = Paths.get("/home/pp/eclipse-workspace/fileToWrite.txt");
	try (BufferedWriter bufferedWriter = Files.newBufferedWriter(paths)) {
	    bufferedWriter.write("Hello...");
	} catch (IOException e) {
	    System.out.println(e);
	}

	String str = "Hi World!";
	try {
	    Files.write(paths, str.getBytes());
	} catch (IOException e) {
	    System.out.println(e);
	}
    }
}
