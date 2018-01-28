package com.pravin.java8.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InstanceMethodRef {
    public static void main(String[] args) {
	// 1
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	System.out.print("Minimum value in list :: ");
	Optional<Integer> minValue = integers.stream().reduce(Math::min);
	minValue.ifPresent(System.out::println);

	// 2
	List<String> strings = Arrays.asList("Pravin", "Prakash", "Patil");
	List<String> sortedList = strings.stream().sorted().collect(Collectors.toList());
	List<String> list = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(sortedList);
	System.out.println(list);
    }
}
