package com.loops;

public class ShoppingDiscount {

	public static void main(String[] args) {
		int PurchasedAmount=10000;
		boolean prime=true;
		
		if(PurchasedAmount>5000) {
			if(prime) {
				System.out.println("You get 20% discount");
			}
			else {
				System.out.println("You get 10% discount");
			}
		}
		else {
			System.out.println("No discount");
		}
	}
}
