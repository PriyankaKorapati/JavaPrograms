package com.problems;

public class Task2Ternary {

	public static void main(String[] args) {
	
		int p=5,q=10; 
		System.out.println(p>q?p:q);
		
		int x=7; 
		System.out.println(x%2==0?"Even":"Odd");
				
		int a=3,b=4,c=5; 
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));


	}

}
