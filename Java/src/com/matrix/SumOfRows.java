package com.matrix;

import java.util.Scanner;

public class SumOfRows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=3;
		int cols=3;
		int[][] a=new int[rows][cols];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < rows; i++) {
			int rsum=0;
			for (int j = 0; j < cols; j++) {
				rsum+=a[i][j];
			}
			System.out.println(rsum);
		}
		System.out.println();
		 for (int j = 0; j < cols; j++) {
			int csum=0; 
				for (int i = 0; i < rows; i++) {
				 	csum+=a[i][j];
			}
			System.out.println(csum);
		}
	}
}
