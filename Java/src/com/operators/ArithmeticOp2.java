package com.operators;

public class ArithmeticOp2 {

	public static void main(String[] args) {
		
		int totalFee=20000;
		int months=12;
		
		int feePerMonth = totalFee/months;
		int remainingAmount = totalFee % months;
		//add
		int extraCharge=500;
		int updatedFee = totalFee+extraCharge;
		//subtraction
		int discount=1000;
		int finalFee = updatedFee-discount;
		int totalPaidInYear = feePerMonth*months;
		
		
		System.out.println("Fee per month:" +feePerMonth);
		System.out.println("Remianing amount:" +remainingAmount);
		System.out.println("Updated fees after extra charge:" +updatedFee);
		System.out.println("final fee after discount:" +finalFee);
		System.out.println("toal paid in year:" +totalPaidInYear);
		
		
		

	}

}
