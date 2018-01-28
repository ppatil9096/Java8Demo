package com.pravin.java8.stream;

import java.util.Arrays;
import java.util.List;

public class IterationExamples {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] { "c", "a", "b", "d" });
		list.forEach(a -> System.out.println(a.toUpperCase()));
	}
}
