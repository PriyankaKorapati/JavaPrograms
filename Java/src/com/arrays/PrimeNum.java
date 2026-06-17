package com.arrays;

import java.util.Arrays;

public class PrimeNum {
	//only divisible by 1 and itself
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		int[] a= {0,5,2,1,7,4,9};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				count++;
			}
		}
		int[] res=new int[count];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				res[j++]=a[i];
			}
		}
		for(int i=0;i<j;i++) {

		}
		System.out.println(Arrays.toString(res));
	}
}




// use n/2 becuase any factor of a num must be 
//less than are equal to half of that num ex:9 fact-1,3,9 so 9/2=4 then we check until 4 


/*
 * finding targeted element
 * how many time repeat targeted element
 * print given array even or odd like 1 odd 2 even
 * */
