package com.pravin.java8.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		Period period = Period.ofDays(1);
		System.out.println(period);
		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(45));
		System.out.println(period.toString());
	}

}
