package com.interfaces;

class Com{
	void display() {
		System.out.println("display method in com class");
	}
}
interface Compute{
	void add();
}

interface Child extends Compute{
	void sub();
}

class grandChild implements Child{
	
	public void add() {
		System.out.println("addition");
	}
	public void sub() {
		System.out.println("subtraction");
		
	}
}
public class Rule5 {

	public static void main(String[] args) {
		grandChild g=new grandChild();
		g.add();

	}

}
