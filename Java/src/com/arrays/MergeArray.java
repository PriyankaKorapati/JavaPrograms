package com.arrays;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] a1= {10,20,30,40,50};
		int[] a2= {1,2,3,4,5};
		int[] merge=new int[a1.length+a2.length];
		int j=0;
		for (int i = 0; i < a1.length; i++) {
			merge[j++]=a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			merge[j++]=a2[i];
		}
		System.out.println(Arrays.toString(merge));
		

	}

}
