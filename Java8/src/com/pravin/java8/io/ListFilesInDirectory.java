package com.pravin.java8.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListFilesInDirectory {
    public static void main(String[] args) {
	try {
	    Files.list(Paths.get("."))
		    .forEach(System.out::println);
	    System.out.println("----------");
	    Files.list(Paths.get("."))
		    .filter(Files::isRegularFile)
		    .forEach(System.out::println);
	    System.out.println("----------");
	    Files.newDirectoryStream(Paths.get("."))
		    .forEach(System.out::println);
	    System.out.println("----------");
	    Files.newDirectoryStream(Paths.get("."), paths -> paths.toFile()
		    .isFile())
		    .forEach(System.out::println);
	    System.out.println("----------");
	    Files.newDirectoryStream(Paths.get("."), paths -> paths.toString()
		    .endsWith(".java"));
	    System.out.println("----------");
	    File[] files = new File(".").listFiles(File::isHidden);
	    for (File file : files) {
		System.out.println(file.getName());
	    }
	} catch (IOException e) {
	    System.out.println(e);
	}
    }
}
