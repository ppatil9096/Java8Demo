package com.pravin.java8.defaultmethod;

public interface MoveAnimal {
    default void move() {
	System.out.println("I am moving in MoveAnimal interface");
    }

    static void move(String str) {
	System.out.println("Animal " + str + " is moving in static move method of  MoveAnimal interface ");
    }

    public void print();
}
