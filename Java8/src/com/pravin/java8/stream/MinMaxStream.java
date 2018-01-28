package com.pravin.java8.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
	// Find Min or Max Date
	LocalDate startDate = LocalDate.now();
	LocalDate endDate = LocalDate.now()
		.plusMonths(1)
		.with(TemporalAdjusters.lastDayOfMonth());
	List<LocalDate> listOfDates = Stream.iterate(startDate, date -> date.plusDays(1))
		.limit(ChronoUnit.DAYS.between(startDate, endDate))
		.collect(Collectors.toList());
	System.out.println(listOfDates);

	LocalDate maxDate = listOfDates.stream()
		.max(Comparator.comparing(LocalDate::toEpochDay))
		.get();
	LocalDate minDate = listOfDates.stream()
		.min(Comparator.comparing(LocalDate::toEpochDay))
		.get();
	System.out.println("Min Date :: " + minDate);
	System.out.println("Max Date :: " + maxDate);

	// Find Min or Max NUmber
	Integer maxInteger = Stream.of(1, 2, 3, 4, 5, 6, 7)
		.max(Comparator.comparing(Integer::valueOf))
		.get();
	Integer minInteger = Stream.of(1, 2, 3, 4, 5, 6, 7)
		.min(Comparator.comparing(Integer::valueOf))
		.get();
	System.out.println("Min Integer :: " + minInteger);
	System.out.println("Min Integer :: " + maxInteger);

	// Find Min or Max Char or String
	String maxString = Stream.of("A", "a", "B", "C", "D", "-")
		.max(Comparator.comparing(String::valueOf))
		.get();
	String minString = Stream.of("A", "a", "B", "C", "D", "-")
		.min(Comparator.comparing(String::valueOf))
		.get();
	System.out.println("Min String :: " + minString);
	System.out.println("Min String :: " + maxString);

	// Find Min or Max Object
	PersonBeanClass personClass1 = new PersonBeanClass("Pravin", "Patil", 1);
	PersonBeanClass personClass2 = new PersonBeanClass("Prakash", "Patil", 2);
	PersonBeanClass personClass3 = new PersonBeanClass("Akshay", "Patil", 3);

	List<PersonBeanClass> list = Arrays.asList(personClass1, personClass2, personClass3);

	PersonBeanClass minObject = list.stream()
		.min(Comparator.comparing(PersonBeanClass::getId))
		.get();
	PersonBeanClass maxObject = list.stream()
		.max(Comparator.comparing(PersonBeanClass::getId))
		.get();
	System.out.println("Min Object :: " + minObject);
	System.out.println("Max Object :: " + maxObject);
    }
}
