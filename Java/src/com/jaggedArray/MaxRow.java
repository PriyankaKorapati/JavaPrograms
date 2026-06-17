package com.jaggedArray;

import java.util.Scanner;

public class MaxRow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int rows=sc.nextInt();
		
		int[][] a=new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the cols for rows" +i+": ");
			int cols=sc.nextInt();
			a[i]=new int[cols];
			
			System.out.println("Enter elements for row: ");
			for (int j = 0; j < cols; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
//		int a[][]= {{1,2,3},
//				{4},
//				{5,6},
//				{7,8,9,10}};
		
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i].length>a[max].length) {
				max=i;
			}
		}
		System.out.println("Row with max elements: "+max);
		System.out.println("Number of elements: "+a[max].length);

	}

}
