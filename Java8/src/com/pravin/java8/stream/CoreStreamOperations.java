package com.pravin.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CoreStreamOperations {
    public static void main(String[] args) {
	List<String> memberNames = new ArrayList<>();
	memberNames.add("A");
	memberNames.add("B");
	memberNames.add("C");
	memberNames.add("D");
	memberNames.add("J");
	memberNames.add("H");
	memberNames.add("G");
	memberNames.add("F");

	// Intermediate operations
	memberNames.stream()
		.filter(s -> s.startsWith("A"))
		.forEach(System.out::println);
	System.out.println("----------");
	memberNames.stream()
		.filter(s -> s.startsWith("A"))
		.map(String::toLowerCase)
		.forEach(System.out::println);
	System.out.println("----------");
	memberNames.stream()
		.sorted()
		.forEach(System.out::println);
	System.out.println("----------");

	// Terminal operations
	memberNames.forEach(System.out::println);
	System.out.println("----------");
	List<String> sortedlist = memberNames.stream()
		.sorted()
		.map(String::toLowerCase)
		.collect(Collectors.toList());
	sortedlist.forEach(System.out::println);
	System.out.println("----------");

	boolean match = memberNames.stream()
		.anyMatch(s -> s.startsWith("G"));
	System.out.println(match);
	System.out.println("----------");

	match = memberNames.stream()
		.allMatch(s -> s.startsWith("A"));
	System.out.println(match);
	System.out.println("----------");

	match = memberNames.stream()
		.noneMatch(s -> s.endsWith("j"));
	System.out.println(match);
	System.out.println("----------");

	long count = memberNames.stream()
		.filter(s -> s.equalsIgnoreCase("F"))
		.count();
	System.out.println(count);
	System.out.println("----------");

	Optional<String> optionalReduce = memberNames.stream()
		.reduce((a, s) -> a + "" + s);
	optionalReduce.ifPresent(System.out::println);
    }
}
