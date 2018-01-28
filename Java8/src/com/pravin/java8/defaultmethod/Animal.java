package com.pravin.java8.defaultmethod;

public class Animal implements Moveable, MoveAnimal {
    public static void main(String[] args) {
	Animal tiger = new Animal();
	tiger.move();
	tiger.print();
	MoveAnimal.move("Dog");
    }

    {
	Moveable.super.move();
	MoveAnimal.super.move();
    }

    @Override
    public void move() {
	System.out.println("Animal Tiger is moving");
    }

    @Override
    public void print() {
	System.out.println("Printing random values ");
    }
}
