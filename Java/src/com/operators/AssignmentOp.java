package com.operators;

public class AssignmentOp {

	public static void main(String[] args) {
		//Assignment operators 
		
		int balance=2000;
		
		System.out.println("add money:" +(balance+=200));
		System.out.println("withdraw:" +(balance-=200));
		System.out.println("interest:" +(balance*=2));
		System.out.println("split among the people:" +(balance/=3));
		System.out.println("remaining money:" +(balance%=4));

	}
}
