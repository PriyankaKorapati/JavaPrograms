package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size: ");
//		int n=sc.nextInt();
//		int[] a=new int[n];
//		System.out.println("enter values: ");
//		for (int i = 0; i < a.length; i++) {
//			a[i]=sc.nextInt();
//		}
		int[] a= {2,4,5,6,7,23};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+ " is even number");
			}else {
				System.out.println(a[i]+" is odd number");
			}
		}

	}

}
