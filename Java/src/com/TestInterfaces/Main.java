package com.TestInterfaces;


interface Payment{
	void Pay(double amount);
}

class UPI implements Payment{
	
	public void Pay(double amount) {
		System.out.println("payment is " +amount+ " done by using UPI");
	}
}
class CreditCard implements Payment{
	
	public void Pay(double amount) {
		System.out.println("payment is " +amount+ " done by using CreditCard");
	}
}
public class Main {

	public static void main(String[] args) {
		UPI u =new UPI();
		u.Pay(200);
		CreditCard c =new CreditCard();
		c.Pay(200);
		

	}

}
