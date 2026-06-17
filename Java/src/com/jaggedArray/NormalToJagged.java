package com.jaggedArray;

import java.util.Arrays;

public class NormalToJagged {

	public static void main(String[] args) {
		int normal[]= {1,2,3,4,5,6};
		int a[][]=new int[3][];
		a[0]=new int[3]; 
		a[1]=new int[1];
		a[2]=new int[2];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=normal[k++];	
			}
		}
		System.out.println(Arrays.deepToString(a));
	}

}
