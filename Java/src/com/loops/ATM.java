package com.loops;

public class ATM {

	public static void main(String[] args) {
		int balance =30000;
		int withdraw=15000;
		if(withdraw<=balance) {
			int Remainingbalance=balance-withdraw;
			System.out.println("Withdraw successful");
			System.out.println("Remaining balance:"+Remainingbalance);
			
		}else {
			System.out.println("Insufficient balance");
		}

	}

}


// ctrl+4 shortcut for to see methods
//scanner class,which is used to read the ip from user
//import scanner class from java.util package
//keybord input
//it is used to read the primitive datatype values 
//non-primitive =strings
//system.in is input stream which is used to read the ip from user 
//and read the ip from keyborad