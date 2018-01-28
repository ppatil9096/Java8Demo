package com.pravin.java8.dateandtime;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.getChronology());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getEra());
		System.out.println(date.getMonth());

		System.out.println(date.isLeapYear());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.lengthOfYear());
		System.out.println(date.toEpochDay());
		System.out.println(date.atStartOfDay());
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);

		System.out.println(date.plusDays(10));
		System.out.println(date.plusMonths(10));
		System.out.println(date.plusWeeks(10));
		System.out.println(date.plusYears(10));

		System.out.println(date.minusDays(15));

	}

}
