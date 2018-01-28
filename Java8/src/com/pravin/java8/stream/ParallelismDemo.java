package com.pravin.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelismDemo {
    public static void main(String[] args) {
	List<Integer> integerList = new ArrayList<>();
	for (int i = 20; i < 25; i++) {
	    integerList.add(i);
	}

	Stream<Integer> stream = integerList.parallelStream();
	Integer[] evenArray = stream.filter(s -> s % 2 == 0)
		.toArray(Integer[]::new);
	for (Integer integer : evenArray) {
	    System.out.println(integer);
	}
    }

}
