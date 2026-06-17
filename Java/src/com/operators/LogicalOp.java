package com.operators;

public class LogicalOp {
	public static void main(String[] args) {
		int age =22;
		int marks =70;
		boolean andr,or_r,notr;
		
		andr=(age>=20 && marks<90);
		or_r=(age>=25 || marks<50);
		notr=!(marks<30);

		System.out.println("and result: "+andr);
		System.out.println("or result: "+or_r);
		System.out.println("not result: "+notr);

		
		
	}

}
