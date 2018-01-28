package com.pravin.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExampleDemo1 {
    public static void main(String[] args) {
	List<String> list = Arrays.asList("A", "a", "A", "s", "S");
	List<String> distinctList = list.stream()
		.distinct()
		.collect(Collectors.toList());
	System.out.println(list);
	System.out.println(distinctList);
    }
}
