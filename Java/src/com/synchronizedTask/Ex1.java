package com.synchronizedTask;


class BankAccount{
	int balance=5000;
	
	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+" depositing: "+amount);
		balance+=amount;
		System.out.println("updated balance"+balance);
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" withdrawing: "+amount);
		if(balance>=amount) {
			balance-=amount;
			System.out.println("updated balance"+balance);
		}else {
			System.out.println("insufficient balance current balance: "+balance);
		}
	}
}

class CustomThread extends Thread{
	BankAccount account;
	CustomThread(BankAccount account,String name){
		this.account=account;
		setName(name);  
	}
	public void run() {
		account.deposit(2000);
		account.withdraw(1000);
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		 CustomThread t1 = new  CustomThread(acc,"customer1");
		 CustomThread t2 = new  CustomThread(acc,"customer2");
		 t1.start();
		 t2.start();
		
	}

}
