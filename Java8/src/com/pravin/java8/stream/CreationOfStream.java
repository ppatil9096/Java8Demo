package com.pravin.java8.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStream {

    public static void main(String[] args) {
	// 1) Using Stream.of(val1, val2, val3….)
	Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
	integerStream.forEach(System.out::print);

	System.out.println("\n");
	// 2) Using Stream.of(arrayOfElements)
	Stream<Integer> arrayStream = Stream.of(new Integer[] { 6, 7, 8, 9 });
	arrayStream.forEach(System.out::print);

	System.out.println("\n");
	// 3) Using someList.stream()
	List<Integer> integers = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    integers.add(i);
	}
	Stream<Integer> listStream = integers.stream();
	listStream.forEach(System.out::print);

	System.out.println("\n");
	// 4) Using Stream.generate() or Stream.iterate() functions
	Stream<Date> dateStream = Stream.generate(Date::new).limit(1);
	dateStream.forEach(System.out::print);

	System.out.println("\n");
	// 5) Using String chars
	IntStream stream = "AZ_az".chars();
	stream.forEach(System.out::println);

	System.out.println("\n");
	// 6) Using String tokens
	Stream<String> stringStream = Stream.of("a~b~c".split("~"));
	stringStream.forEach(System.out::print);
    }

}
