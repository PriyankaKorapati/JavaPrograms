package com.matrixTask;

public class BoundaryMatrix {

	public static void main(String[] args) {
		int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		int rowA=a.length;
		int colA=a[0].length;
		
		for (int i = 0; i < colA; i++) {
			System.out.print(a[0][i]+" ");
		}
		for (int i = 1; i < rowA; i++) {
			System.out.print(a[i][colA-1]+" ");
		}
		for (int i = colA-2; i >=0; i--) {
			System.out.print(a[rowA-1][i]+" ");
		}
		for (int i = rowA-2; i >0; i--) {
			System.out.print(a[i][0]+" ");
		}
	}

}
