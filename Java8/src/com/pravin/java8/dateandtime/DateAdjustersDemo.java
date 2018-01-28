package com.pravin.java8.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DateAdjustersDemo {
    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2017, Month.DECEMBER, 05);
	System.out.println(date);
	LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
	System.out.println(endOfMonth);

	LocalDate nextDay = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	System.out.println(nextDay);
    }
}
