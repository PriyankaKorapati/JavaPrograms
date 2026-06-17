package com.matrix;

public class Diagonal {

	public static void main(String[] args) {
		int a[][]= {{1,0,0},
					{0,2,0},
					{0,0,3}};
		int rows=a.length;
		int cols=a[0].length;
		boolean status=true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(i!=j && a[i][j]!=0) {
					status=false;
				}
			}
		}
		System.out.println(status?"diagonal":"not a diagonal");
	}

}
