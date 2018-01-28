package com.pravin.java8.lambdaexp;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public static int nameCompare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);
	}

	public String toString() {
		return name;
	}
}
