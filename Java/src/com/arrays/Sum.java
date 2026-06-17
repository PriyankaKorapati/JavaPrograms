package com.arrays;

public class Sum {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		
		int sum=0;
		int avg=a.length;
		for(int i:a) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(sum/avg);
		
		
	}

}
