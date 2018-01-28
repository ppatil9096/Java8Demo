package com.pravin.java8.lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pravin");
		list.add("Prakash");
		list.add("Patil");

		list.forEach((l) -> System.out.println(l));
	}

}
