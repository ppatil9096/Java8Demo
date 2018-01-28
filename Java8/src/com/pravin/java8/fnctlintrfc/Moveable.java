package com.pravin.java8.fnctlintrfc;

@FunctionalInterface
public interface Moveable {
    default void move() {
	System.out.println("I am moving in Moveable interface");
    }

    void sound();

    String toString();

    boolean equals(Object obj);
}