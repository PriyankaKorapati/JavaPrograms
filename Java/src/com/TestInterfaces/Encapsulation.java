package com.TestInterfaces;

class BankAccount{
	private int accountNum;
	private String userName;
	private double balance;
	
	public void setAccountNum(int accountNum) {
		if(accountNum>=0) {
			this.accountNum=accountNum;
		}else {
		 System.out.println("invalid account number");
		}
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setName(String userName) {
		if(userName!=null) {
			this.userName=userName;
		}else {
			System.out.println("invalid username");
		}
	}
	
	public String getName() {
		return userName;
	}
	
	public void setBalance(double amount) {
		if(balance>=0) {
			this.balance=balance;
		}else {
			this.balance=0;
		}
	}
	public double getBalance() {
		return balance;
	}
}



public class Encapsulation {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.setAccountNum(1234556);
		acc.setName("priya");
		acc.setBalance(30000);
		System.out.println("account number:" +acc.getAccountNum());
		System.out.println("Username:" +acc.getName());
		System.out.println("Balance:" +acc.getBalance());
		

	}

}
