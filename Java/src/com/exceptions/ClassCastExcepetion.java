package com.exceptions;

class Animal {

}
class Dog extends Animal{
	public static void bark() {
		System.out.println("dog is barking");
	}
	
}

public class ClassCastExcepetion{
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog)a;
		d.bark();

	}

}

