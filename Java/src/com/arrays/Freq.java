package com.arrays;

public class Freq {

	public static void main(String[] args) {
		int a[]={10,40,20,30,40,50,40,60};
		int target=3;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(count);
		}else {
			System.out.println("not found");
		}

	}

}
