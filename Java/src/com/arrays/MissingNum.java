package com.arrays;

public class MissingNum {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,7};
		
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		int p=1;
		while(p<=max) {
			boolean isContains=false;
			for (int i = 0; i < a.length; i++) {
				if(p==a[i]) {
					isContains=true;
					break;
				}
			}
			if(!isContains) {
				System.out.println(p);
			}p++;	
		}	
	}
}
		
		
		
		
		
		
		
		
		
//		int sum=0,asum=0;
//		for (int i = 1; i <=7; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//		for (int i = 0; i < a.length; i++) {
//			asum+=a[i];
//		}
//		System.out.println(asum);
//		System.out.println(sum-asum);
		
		
//	}

