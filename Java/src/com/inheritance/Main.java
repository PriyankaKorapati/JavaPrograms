package com.inheritance;
class Account{
	String AccountHolderName="priya";
	double balance=50000;
	void deposit(int deposit) {
		System.out.println("Deposited amount is: "+deposit);
		balance+=deposit;
		System.out.println("Available balance: "+balance);
	}
}
class savingAccount extends Account{
	void addInterest() {
		balance+=balance*0.05;
		System.out.println("Balance available after adding 5% interest: "+balance);
	}
}
class currentAccount extends Account{
	void checkoverdraft() {
		System.out.println("Overdraft is available");
	}
}
public class Main {
	public static void main(String[] args) {
		savingAccount s=new savingAccount();
		System.out.println("-----------------------");
		System.out.println("saving account");
		System.out.println("-----------------------");
		s.deposit(5000);
		s.addInterest();
		System.out.println("\n-----------------------");
		
		currentAccount c=new currentAccount();
		System.out.println("current account");
		System.out.println("-----------------------");
		c.deposit(10000);
		c.checkoverdraft();
	}
}
