package com.abstraction;


final class Vehicle{
	void start(){
		System.out.println("vehicle started");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
//		variable
//		final int a;
//		a=10;
//		System.out.println(a);
		Vehicle v=new Vehicle();
		v.start();
	}

}
