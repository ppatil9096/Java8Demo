package com.pravin.java8.methodref;

import java.util.Arrays;
import java.util.List;

public class StaticMethodRef {
    public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	System.out.println("Maximum value in list :: " + integers.stream().reduce(Math::max).get());
    }
}
