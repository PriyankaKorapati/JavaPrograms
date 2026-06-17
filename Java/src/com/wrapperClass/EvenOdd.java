package com.wrapperClass;

public class EvenOdd {

	public static void main(String[] args) {
		String s="12";
		int n =Integer.parseInt(s);
		if((n&1)==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}

