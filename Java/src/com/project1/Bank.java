package com.project1;

import java.util.Scanner;

public class Bank {
	String username="priyanka";
	String ifsc="SBIN000123";
	long accountNumber=1234567890L ;
	long mobileNumber= 991234567;
	int pin= 1234;
	String firstName="priyanka";
	String lastName="korapati";
	double balance=5000;
	
	Scanner sc=new Scanner(System.in);
	public void displayDetails() {
		System.out.println("\n----------Bank Details----------");
		System.out.println("\nName: "+firstName+ " " +lastName);
		System.out.println("Username: " +username);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Mobile Number: "+mobileNumber);
		System.out.println("Balanace: "+balance);
		System.out.println("----------------------------------");
		
	}
	public void balanceEnquiry() {
		System.out.println("Current Balance: "+balance);
	}
	
	public void withdraw() {
		System.out.println("Enter Amount: ");
		double amount=sc.nextDouble();
		
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdraw successful");
//			System.out.println("Remaining Balance: "+balance);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void deposite() {
		System.out.println("Enter Amount: ");
		double amount=sc.nextDouble();
		
		if(amount>0) {
			balance+=amount;
			System.out.println("deposite successful");
//			System.out.println("Updated Amount: "+balance);
		}else {
			System.out.println("Insufficient amount");
		}
	}
	public void changeMobile() {
		System.out.println("Enter new number: ");
		long moblieNumber=sc.nextLong();
		System.out.println("mobile number updated.");
	}
	public void changePin() {
		
	}
	
	void menu() {
		int choice=0;
		while(choice!=7) {
			System.out.println("\nChoose Option:");
			System.out.println("1.Balance Enquiry");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposite");
			System.out.println("4.Change Mobile Number");
			System.out.println("5.Change PIN");
			System.out.println("6.Display");
			System.out.println("7.Exit");
			
			System.out.println("Enter Choice: ");
			choice=sc.nextInt();
			
		switch (choice) {
		case 1: 
			    balanceEnquiry();
				break;
		case 2: withdraw();
				break;
		case 3: deposite();
				break;
		case 4: changeMobile();
				break;
		case 5: changePin();
				break;
		case 6: displayDetails();
				break;
		case 7: 
			   System.out.println("Thank you"); 
			   break;
        default: 
        			System.out.println("Invalid option");
		}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("========= Welcome to SBI Bank========");
		
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		
		System.out.println("\nEnter PIN: ");
		int pin=sc.nextInt();
		
		if(pin==b.pin) {
			System.out.println("Login Successful");
			b.menu();
		}
		else {
			System.out.println("Wrong");
		}
	
	}

}
