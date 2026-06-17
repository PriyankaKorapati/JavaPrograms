package com.problems;

public class Task2Unary {
	public static void main(String[] args) {
		int a=5; 
		System.out.println(a++ + ++a);
	
		int b=3; int c=b++ + b++ + ++b; 
		System.out.println(c);
	
		int d=10; 
		System.out.println(--d + d--);
	//	int e=10; int f=e-- + e-- + --e; 
	//	System.out.println(f);

	}

}
