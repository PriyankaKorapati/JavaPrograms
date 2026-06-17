package com.jaggedArray;

import java.util.Arrays;
import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of rows :");
		int rows=sc.nextInt();
		int a[][]=new int[rows][];
		
		for (int i = 0; i < rows; i++) {
			System.out.println("enter the cols for row "+i+": ");
			int cols=sc.nextInt();
			a[i]=new int[cols];
		
//		System.out.println(Arrays.deepToString(a));
	
			System.out.println("enter elements for row");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(a));
		
		
	}

}
