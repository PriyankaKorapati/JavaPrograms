package com.exceptions;

public class ATM {
	
	public static void ATMmachine(int balance,int withdrawl){
		
		if(withdrawl>balance) {
			throw new ArithmeticException("insufficient balance");
		}
	}
	public static void main(String[] args) {
		
		try {
			ATMmachine(200,500);
		}catch(Exception e){
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}finally {
			System.out.println("collect the card");
		}
	}

}
