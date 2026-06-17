package com.matrix;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=3;
		int cols=4;
//		int arr[][]= {{1,2,3,4},
//		{1,2,3,4},
//		{1,2,3,4}
		
//		};
		int[][] a=new int[rows][cols];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(a.length); // no of rows =3
		System.out.println(a[0].length); // no of cols=4
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//print the sum of elements in the row 

