package com.arrays;

import java.util.Scanner;

public class EvenOddIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter values: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("index " +i+ " is even number,"+"the value is "+a[i]);
			}else {
				System.out.println("index " +i+ " is odd number,"+"the value is "+a[i]);
			}
		}

	}

}
