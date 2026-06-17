package com.arrays;

public class TargetEle {

	public static void main(String[] args) {
		int[] a= {2, 3, 4, 7, 10, 12, 27};
		int target= 27;
		boolean status=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				System.out.println(target);
				status=true;
			}
		}
		if(!status) {
			System.out.println("element not found");
			
		}

	}

}
