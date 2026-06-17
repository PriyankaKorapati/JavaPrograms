package com.arrays;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int tar=10;
		boolean status=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <i+1; j++) {
				if(a[i]+a[j]==tar) {
					System.out.println("("+a[i]+","+a[j]+")");
				}
				else {
					System.out.println("not found");
				}
				
			}
		}
		

	}

}


//if 2 elements added result of tar 10
//(1,9)(2,8)