package com.matrix;

public class ScalarMatrix {
//scalar matrix is a all the diagonal elements are equal.

	public static void main(String[] args) {
		int a[][]= {{3,0,0},
					{0,3,0},
					{0,0,3}};
		
		boolean status=true;
		int diagonal=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j) {
					if(a[i][j]!=diagonal) {
						status=false;
						break;
					}
				}
				else {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
				}		
			}
		}	
		System.out.println(status?"scalar":"not a scalar");
	}
	

}
