package com.arrays;

public class MissingReverse {

	public static void main(String[] args) {
		int[] a= {1,2,4,6,8};
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		int p=max; //missing num comes in desc 
		while(p>=1) {
			boolean isContains=false;
			for (int i = 0; i < a.length; i++) {
				if(p==a[i]) {
					isContains=true;
					break;
				}
			}
			if(!isContains) {
				System.out.println(p);
			}p--;
		}
		

	}

}


//654321
//524613
