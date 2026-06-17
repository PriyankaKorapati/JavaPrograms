package com.numbers;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
}



/*
 * 1*1
 * 1*2
 * 2*3
 * 6*4
 * 24*5
 */
