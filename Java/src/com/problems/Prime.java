package com.problems;

public class Prime {

	public static void main(String[] args) {
	
		int n=50;
		int count=0;
		for(int i=2;i<=n;i++) {
			boolean isP=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					isP=false;
					break;	
				}
			}
		
		if(isP) {
			count++;
		}
		}
		System.out.println(count);
	
	}
}

