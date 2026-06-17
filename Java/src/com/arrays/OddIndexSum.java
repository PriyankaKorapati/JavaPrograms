package com.arrays;

import java.util.Scanner;

public class OddIndexSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter values: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0) {
				sum+=a[i];
			}
		}
		System.out.println("sum of odd index elements: "+sum);

	}

}
