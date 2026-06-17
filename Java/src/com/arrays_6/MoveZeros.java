package com.arrays_6;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] a= {0,0,1,0,3,12};
		int[] c=new int[a.length];
		int j=0;
		//move non-zeros
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				c[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
		
		//fill all the remaning ele to zero i=j beacuase it start current pos to 0's
//		for (int i = j; i < a.length; i++) {
//			a[i]=0;
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//			 }
		}
}
















