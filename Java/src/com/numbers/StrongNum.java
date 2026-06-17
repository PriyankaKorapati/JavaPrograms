package com.numbers;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=sc.nextInt();
		int original=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
		}
			sum+=fact;
			n/=10;
		}
		if(sum==original) {
			System.out.println(sum+ "strong num");
		}else {
			System.out.println(original+ "not a strong num");
		}
	}
}





















