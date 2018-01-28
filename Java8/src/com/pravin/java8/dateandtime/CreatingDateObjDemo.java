package com.pravin.java8.dateandtime;

import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneOffset;

public class CreatingDateObjDemo {
    public static void main(String[] args) {
	// builder pattern
	OffsetDateTime dateTime = Year.of(2017).atMonth(Month.DECEMBER).atDay(15).atTime(0, 0)
		.atOffset(ZoneOffset.of("+03:00"));
	System.out.println(dateTime);
	// factory method
	OffsetDateTime offsetDateTime = OffsetDateTime.of(2017, 12, 04, 0, 0, 0, 0, ZoneOffset.of("+03:00"));
	System.out.println(offsetDateTime);
    }
}
