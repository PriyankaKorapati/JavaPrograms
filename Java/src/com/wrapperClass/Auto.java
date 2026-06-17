package com.wrapperClass;

public class Auto {

	public static void main(String[] args) {
		System.out.println("Auto boxing");
		
		int a=100;
		System.out.println(a);
		Integer i=a;
		System.out.println(i.toString()+ " "+10);
		
		System.out.println("\nAuto Unboxing");
		
		Integer a1=300;
		System.out.println(a1);
		int i1=a1;
		System.out.println(i1);


	}

}
