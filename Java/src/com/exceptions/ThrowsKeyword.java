package com.exceptions;

public class ThrowsKeyword {
	
	public static void Bank(int amount,int balance) {
		if(balance<amount) {
			throw new ArithmeticException("insufficient balance");
		}
		balance=balance-amount;
		System.out.println("amount withdrawn is:"+amount);
		System.out.println("remaining balance is: "+balance);
		int[] a= {23,28,32,18,20};
		System.out.println(a[5]);
	}

	public static void main(String[] args) {
		try {
			Bank(300,1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
