package com.pravin.java8.fnctlintrfc;

public class Dog implements Moveable {
    public static void main(String[] args) {
	Moveable dog = new Dog();
	dog.sound();
	dog.move();
    }

    @Override
    public void sound() {
	System.out.println("Dog sounds like bhaoooohhhh!!!!!!!");
    }
}
