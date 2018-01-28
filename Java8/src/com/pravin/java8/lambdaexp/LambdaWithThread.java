package com.pravin.java8.lambdaexp;

public class LambdaWithThread {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("I'm in runnable's Run method ")).start();
	}
}
