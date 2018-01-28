package com.pravin.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
	Optional<Integer> emptyObject = Optional.empty();
	Optional<Integer> intObject = Optional.of(10);
	Optional<Integer> nulllObject = Optional.ofNullable(null);

	emptyObject.ifPresent(System.out::println);
	intObject.ifPresent(System.out::println);
	nulllObject.ifPresent(System.out::println);

	int value = emptyObject.orElse(15);
	System.out.println(value);

    }
}
