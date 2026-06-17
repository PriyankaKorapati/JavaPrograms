package com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {10,20,30,3,40};
		int target=3;
		boolean status=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				status=true;
				break;
			}
		}
		if(status) {
			System.out.println("element found");
		}else {
			System.out.println("not found");
		}

	}

}
