package com.pravin.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShortCircuitOperations {
    public static void main(String[] args) {

	List<String> memberNames = new ArrayList<>();
	memberNames.add("Amitabh");
	memberNames.add("Shekhar");
	memberNames.add("Aman");
	memberNames.add("Rahul");
	memberNames.add("Shahrukh");
	memberNames.add("Salman");
	memberNames.add("Yana");
	memberNames.add("Lokesh");
	boolean match = memberNames.stream()
		.anyMatch(s -> s.startsWith("G"));
	System.out.println(match);

	Optional<String> optionalString = memberNames.stream()
		.filter(s -> s.endsWith("h"))
		.findFirst();
	optionalString.ifPresent(System.out::println);
    }
}
