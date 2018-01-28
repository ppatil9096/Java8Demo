package com.pravin.java8.defaultmethod;

public interface Moveable {
    default void move() {
	System.out.println("I am moving in Moveable interface");
    }
}
