package com.pravin.java8.dateandtime;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo {
	public static void main(String[] args) {
		Duration duration = Duration.ofMillis(1000);
		System.out.println(duration);

		System.out.println(Duration.ofSeconds(60));
		System.out.println(Duration.ofMinutes(180));
		System.out.println(Duration.ofNanos(1000000000));

		System.out.println(Duration.ofHours(2));

		duration = Duration.between(Instant.now(), Instant.now().plusSeconds(30));
		System.out.println(duration);

		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofHours(4)));
		System.out.println(duration);
	}
}
