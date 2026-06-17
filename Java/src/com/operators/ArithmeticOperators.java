package com.operators;
public class ArithmeticOperators {
	public static void main(String[] args) {
		int apples =5;
		int applesPrice=100;
		int applesCost=apples * applesPrice;
		
		int milkPackets =3;
		int milkPrice=30;
		int milkCost= milkPackets * milkPrice;  // Multiplication
		
		System.out.println("Cost of apples: ₹"+applesCost);
		System.out.println("Cost of milk packets: ₹"+milkCost);
		
		//Addition 
		int totalBill= applesCost+milkCost;
		System.out.println("Total Bill: ₹"+totalBill);
		
		//Subtraction
		int discount= 10;
		int finalBill= totalBill-discount;
		System.out.println("After discount: ₹"+finalBill);
		
		//Division
		int people =3;
		int amountPerPerson= finalBill/people;
		System.out.println("Amount one person pay: ₹"+amountPerPerson);
		
		//Modulus
		int remainingAmount= finalBill % people;
		System.out.println("Remaining Amount: ₹"+remainingAmount);

	}

}
