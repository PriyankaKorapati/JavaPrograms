package com.matrixTask;

import java.util.Arrays;
import java.util.Iterator;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2},
					{3,4}};
		int rowA=a.length;
		int colA=a[0].length;
		int[][] c = new int[rowA][colA];
		
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colA; j++) {
				c[j][i]=a[i][j];
			}
		}
		System.out.println(Arrays.deepToString(c));
		
	}

	

}
