package com.arrays;

public class TargetRepeat {

	public static void main(String[] args) {
		int[] a= {2,3,5,6,3,23,30};
		int target=3;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				count++;
			}
		}
		System.out.println("Repeated target element: "+target+ ",count= "+count);

	}

}
