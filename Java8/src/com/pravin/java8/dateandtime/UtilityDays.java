package com.pravin.java8.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class UtilityDays {

    public static void main(String[] args) {

	// DayOfWeek
	System.out.println(DayOfWeek.SUNDAY);
	System.out.println(DayOfWeek.of(6));
	DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
	System.out.println(dayOfWeek.getValue());

	LocalDate date = LocalDate.now();
	System.out.println(date.with(DayOfWeek.SUNDAY));

	// DayOfMonth
	System.out.println(Month.APRIL);
	System.out.println(Month.of(10));

	// MonthDay
	System.out.println(MonthDay.now());
	System.out.println(MonthDay.of(10, 10));

	// Year
	System.out.println(Year.isLeap(2018));
	System.out.println(Year.now());
	System.out.println(Year.MAX_VALUE);

	// YearMonth
	System.out.println(YearMonth.now());
	System.out.println(YearMonth.of(2020, 1));
	
    }

}
