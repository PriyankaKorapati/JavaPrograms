package com.jaggedArray;

import java.util.Arrays;

public class  Multiply{

	public static void main(String[] args) {
		int rows=5;
		int a[][]=new int[rows][];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=new int[i+1];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(i+1)*(j+1);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

// wa p to print max element in given row 
//1 2 
//3 
//4 5 6
//7 8 9 10
//3rd index row is having max element
//no of elements in 3rd index --4
