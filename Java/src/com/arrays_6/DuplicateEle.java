package com.arrays_6;

import java.util.Scanner;

public class DuplicateEle {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,3,5,7,7};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}












