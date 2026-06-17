package com.arrays;

public class MaxEle {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
//		int max=0;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
//		for(int i:a) {
//			if(i>max) {
//				max=i;
//			}
//		}
//		System.out.println(max);
		int min=a[0];
//		for(int i:a) {
//			if(i<min) {
//				min=i;
//			}
//		}
//		System.out.println(min);
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
		}
	}
		System.out.println(min);
		
	}
}


//sumand avg of the given array