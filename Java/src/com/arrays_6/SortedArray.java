package com.arrays_6;

public class SortedArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,50,40};
		
		boolean sorted=true;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<a[i+1]) {
				sorted=false;
				break;
			}
		}
		if(sorted) {
			System.out.println("array sorted");
		}else {
			System.out.println("not sorted");
		}
		
		

	}

}
