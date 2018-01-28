package com.pravin.java8.dateandtime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffsetDateTimeDemo {
	public static void main(String[] args) {
		OffsetDateTime dateTime = OffsetDateTime.now();
		System.out.println(dateTime);

		dateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
		System.out.println(dateTime.toString()); // 2013-05-15T10:10:37.258+05:30

		dateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
		System.out.println(dateTime.toString()); // 2013-05-14T22:10:37.258-06:30

		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime.toString()); // 2013-05-15T06:45:45.290+02:00[Europe/Paris]
	}
}
