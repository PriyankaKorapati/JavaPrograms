package com.operators;

public class RelationalOp {

	public static void main(String[] args) {
		int marks=80;
		int passmarks=40;
		
		System.out.println("greater than: "+(marks>passmarks));
		System.out.println("less than: "+(marks<50));
		System.out.println("greaterthan or equal: "+(marks>=75));
		System.out.println("lessthan or equal: "+(marks<=35));
		System.out.println("equal: "+(marks==80));
		System.out.println("not equal: "+!(marks>=passmarks));

	}

}
