package com.arrays;

import java.util.Arrays;

public class StrongNum {

	public static void main(String[] args) {
		int[] a={0,5,2,1,7,4,9};
		int[] res=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int temp=n,sum=0;
			if(n==0) continue;
			while(temp>0) {
				int digit=temp%10;
				int fact=1;
				for(int j=1;j<=digit;j++) {
					fact*=j;
				}
				sum+=fact;
				temp/=10;
			}
			if(sum==n) {
				res[k++]=n;
			}
		}
//		System.out.print("strong numbers:");
		for(int i=0;i<k;i++) {
//			System.out.print(res[i]+" ");
		}
		System.out.println(Arrays.toString(res));
	}
}


























