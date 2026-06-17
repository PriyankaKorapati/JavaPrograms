package com.operators;

public class BitwiseOp {

	public static void main(String[] args) {
		int a=8,b=4,c=-8;
		System.out.println("Bitwise and:"+(a&b));
		System.out.println("Bitwise or:"+(a|b));
		System.out.println("Bitwise not:"+(~a));
		System.out.println("left shift:"+(a<<2));
		System.out.println("right shift:"+(a>>2));
		System.out.println("right shift:"+(c>>>1));
		
	}

}
