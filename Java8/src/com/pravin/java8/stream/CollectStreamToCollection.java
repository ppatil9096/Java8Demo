package com.pravin.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamToCollection {

    public static void main(String[] args) {

	// 1) List
	List<Integer> integers = new ArrayList<>();
	for (int i = 0; i < 10; i++) {
	    integers.add(i);
	}

	Stream<Integer> listStream = integers.stream();
	List<Integer> evenList = listStream.filter(i -> i % 2 == 0)
		.collect(Collectors.toList());
	evenList.forEach(System.out::println);

	// 2) Array
	Stream<Integer> arrayStream = integers.stream();
	Integer[] integerArray = arrayStream.filter(i -> i % 2 == 0)
		.toArray(Integer[]::new);
	for (Integer integer : integerArray) {
	    System.out.print(integer);
	}
	// ...and many more
    }

}
