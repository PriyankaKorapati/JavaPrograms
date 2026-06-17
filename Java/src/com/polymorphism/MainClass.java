package com.polymorphism;

class Payment {
 public void pay() {
     System.out.println("Processing payment");
 }
}

class UPI extends Payment{
 @Override
 public void pay() {
     System.out.println("Paying using UPI");
 }
}


class CreditCard extends Payment {
 @Override
 public void pay() {
     System.out.println("Paying using Credit Card");
 }
}


public class MainClass {
 public static void main(String[] args) {

	    Payment p= new Payment();
		System.out.println("Payment class");
		System.out.println("-------------------");
		p.pay();
		UPI p1= new UPI();
		System.out.println("\nUPI class");
		System.out.println("-------------------");
		p1.pay();
		
		Payment u= new UPI();
		System.out.println("\nOverrided UPI class");
		System.out.println("-------------------");
		u.pay();
		Payment c= new CreditCard();
		System.out.println("\nOverrided CreditCard class");
		System.out.println("-------------------");
		c.pay();
		 }
}

