package com.pravin.java8.lambdaexp;

import java.util.Arrays;

public class LambdaWithComparaTo {
	public static void main(String[] args) {
		Employee[] employees = { new Employee("1"), new Employee("3"), new Employee("2") };
		System.out.println("Before sorting the names :: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After sorting the names :: " + Arrays.toString(employees));
	}
}
