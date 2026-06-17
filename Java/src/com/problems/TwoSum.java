package com.problems;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int[] a,int target) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] a= {1,9,2,7,8};
		int target=10;
		int[] res=twoSum(a,target);
		
//		System.out.println(res[i]+","+res[j]);

	}

}
