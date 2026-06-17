package com.methods;

public class MethodsTask {
	static void calculateBill() {
		double price=500;
		int quantity=3;
		
		double totalPrice=price*quantity;
		
		//10% discount(assignment operator)
		double discount=totalPrice*0.10;
		totalPrice-=discount;
		
		//5% gst
		double gst=totalPrice*0.05;
		totalPrice+=gst;
		
		int result=quantity&1;
		
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("GST: " + gst);
        System.out.println("Final Bill Amount: " + totalPrice);
		System.out.println((result==0)?"even quantity":"odd quantity");			
	}

	public static void main(String[] args) {
		calculateBill();
	}
}
