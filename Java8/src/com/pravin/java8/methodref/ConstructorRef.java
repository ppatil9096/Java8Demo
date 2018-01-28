package com.pravin.java8.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructorRef {
    public static void main(String[] args) {
	List<Integer> integers = IntStream.range(1, 100).boxed().collect(Collectors.toCollection(ArrayList::new));
	integers.stream().reduce(Math::max).ifPresent(System.out::print);
    }
}
