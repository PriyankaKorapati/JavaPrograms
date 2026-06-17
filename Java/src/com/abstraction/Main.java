package com.abstraction;

abstract class Plane{
	abstract void fly();
	abstract void altitude();
}

class Cargo extends Plane{
	void fly() {
		System.out.println("Cargo plane is flying with goods");
	}

	void altitude() {
		System.out.println("Cargo plane is tookoff with high altitude");
	}
}
class Passengers extends Plane{

	void fly() {
		System.out.println("Passanger plane is flying with peoples");
	}
	void altitude() {
		System.out.println("Passanger plane is tookoff with medium altitude");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Cargo c=new Cargo();
		c.fly();
		c.altitude();

	}

}
