package com.constructor;

public class BankDetails {

	String name;
	int accno;
	double balance;
	

	public BankDetails(String name,int accno,double balance) {
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	
	public void display() {
		System.out.println("Account holder name:" +name+ 
				"\nAccount number: " +accno+ "\nBalance :" +balance);
	}
	
	
	public static void main(String[] args) {
		BankDetails b1= new BankDetails("priya",2003456,50000.0);
		b1.display();	
		
		
	}

}






//what is constructor
//what are diff types of constructors there
//copy constructor
//why do we need to use copy constructor 
//what is this keyword and this call
//diff between this and this()
//can we overload the constr-yes
//can we override the constr-no