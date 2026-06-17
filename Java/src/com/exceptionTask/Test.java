package com.exceptionTask;

import java.util.Scanner;

class Handling{
	public static void tiMethod(int n) {
		try {
			System.out.println("10000");
			tilMethod(n);
			System.out.println("Coders");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void tilMethod(int n) throws Exception {
		try {
			int res=100/n;
				
			System.out.println("Completed");
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception: "+e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		Handling.tiMethod(n);
		sc.close();
		
	}

}
