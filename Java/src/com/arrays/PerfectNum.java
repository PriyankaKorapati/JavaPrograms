package com.arrays;

public class PerfectNum {

	public static void main(String[] args) {
		int[] a= {1,3,6,5,12,28,34};
		int[] res=new int[a.length];
		int k=0; //stores valid values
		
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int sum=0;
			for(int j=1;j<n;j++) {
				if(n%j==0) {
					sum+=j;
				}
			}
			if(sum==n) {
				res[k++]=n; //res[0]=6 [6,0,0,0,0]->res[1]=28 [6,28]
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(res[i]+" ");
		}

	}
}




















