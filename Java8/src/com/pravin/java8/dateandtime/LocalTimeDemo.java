package com.pravin.java8.dateandtime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);// 11:36:42.011
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());

		System.out.println(time.toNanoOfDay());
		System.out.println(time.toSecondOfDay());
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);

		System.out.println(time.plusHours(2));
		System.out.println(time.plusMinutes(15));
	}

}
