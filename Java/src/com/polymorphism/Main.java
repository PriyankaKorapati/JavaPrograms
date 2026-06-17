package com.polymorphism;

public class Main {
	
	public static void main(String[] args) {
		int a=3;
		int b=27;
		Integer i=a;
//		int d=(byte)a;
		add(a,b);
	}
	public static void add(byte a,byte b) {
		System.out.println("byte values");
	}
	public static void add(int a,int b) {
		System.out.println("int values");
	}
	public static void add(long a,long b) {
		System.out.println("long values");
	}
	public static void add(float a,float b) {
		System.out.println("float values");
	}
	public static void add(double a,double b) {
		System.out.println("double values");
	}
	public static void add(Integer a,Integer b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("wrapper integer class");
	}

}
