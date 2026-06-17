package com.arrays;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		int[] a= {1,9,2,6,7,8,4,5,5};
		int target=10;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		
		int[] nums=new int[n];
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target) {
					System.out.println("[" +i+ "," +j+ "]");
				}
			}
		}


	}

}
