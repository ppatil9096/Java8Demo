package com.pravin.java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
	String dateonly = "2017-06-04";
	LocalDate date = LocalDate.parse(dateonly);
	System.out.println("Date :: " + date);

	String armisticeDateTime = "2016-04-04T11:50";
	LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
	System.out.println("Date/Time :: " + aLDT);

	String anotherDate = "04 Apr 2016";
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
	LocalDate random = LocalDate.parse(anotherDate, df);
	System.out.println(anotherDate + " parses as " + random);
    }
}
