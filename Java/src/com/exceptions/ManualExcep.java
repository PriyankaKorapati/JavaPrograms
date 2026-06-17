package com.exceptions;

import java.util.Scanner;

public class ManualExcep {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			if(a<b) {
				throw new ArithmeticException();
//				ArithmeticException e=new ArithmeticException();
//				throw e;
				
			}
			int res=a-b;
			System.out.println(res);
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			System.out.println("a is lessthan b,so subtraction is not possible");
		}

	}

}
