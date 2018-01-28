package com.pravin.java8.dateandtime;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(instant.plus(Duration.ofMillis(5000)));
		System.out.println(instant.minus(Duration.ofMillis(5000)));
		System.out.println(instant.minusMillis(5000));
	}
}
