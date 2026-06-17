package com.arrays_6;

public class SecLargest {
	
	public static int secondLargest(int[] a) {
		int firstLarg=Integer.MIN_VALUE;
		int secondLarg=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>firstLarg) {
				secondLarg=firstLarg;
				firstLarg=a[i];
			}
			//array has duplicates -> it present in firLar then no need to check seclargest
			else if(a[i]>secondLarg && a[i]!=firstLarg) {
				secondLarg=a[i];
			}
		}
		return secondLarg;
	}
	
	public static int secondSmallest(int[] a) {
		int firstS=Integer.MAX_VALUE;
		int secondS=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<firstS) {
				secondS=firstS;
				firstS=a[i];
			}
			else if(a[i]<secondS && a[i]!=firstS) {
				secondS=a[i];
			}
		}
		return secondS;
	}
	

	public static void main(String[] args) {
		//{10,10,10},{10,10,5,10},{10},
		int a[]= {10,20,30,40,50};
		System.out.println(secondLargest(a));
		System.out.println(secondSmallest(a));
}
}