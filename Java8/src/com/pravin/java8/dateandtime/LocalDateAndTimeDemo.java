package com.pravin.java8.dateandtime;

import java.time.LocalDateTime;

public class LocalDateAndTimeDemo {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getDayOfWeek());
	}
}
