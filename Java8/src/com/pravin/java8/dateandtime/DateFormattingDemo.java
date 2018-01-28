package com.pravin.java8.dateandtime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateFormattingDemo {
    public static void main(String[] args) {
	DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
	formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendLiteral("-").appendZoneOrOffsetId();
	DateTimeFormatter formatter = formatterBuilder.toFormatter();
	System.out.println(formatter.format(ZonedDateTime.now()));
    }
}
