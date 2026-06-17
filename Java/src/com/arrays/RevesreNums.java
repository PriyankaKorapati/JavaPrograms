package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevesreNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = size-1; i >=0; i--) {
			System.out.println(a[i]+"");
			
		}
//		System.out.println(Arrays.toString(a));
//wrp to print give array in reverse
//		to merge give array a={10,20,30,40,50} a1={1,2,3,4,5}
//		wap to print prime nums in the given array in the form of array
//		to print strong num in the given array 0 5 2 1 7 4 9
//		to perfect num 1 3 6 5 12 28 34

	}

}
