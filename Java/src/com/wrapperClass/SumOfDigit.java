package com.wrapperClass;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String str=sc.next();
		int n =Integer.parseInt(str);
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
			
		}
		System.out.println(sum);

	}

}
