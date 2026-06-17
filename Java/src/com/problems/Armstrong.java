package com.problems;

public class Armstrong {
	static boolean armstNum(int n) {
//		int n=153;
		int count=0;
		int temp=n;
		while(temp>0) {
			count++;
			temp/=10;
		}
		int original=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power*=digit;
				
			}
			sum+=power;
			n/=10;
		}
		return sum==original;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		for(int i=1;i<=n;i++) {
			if(armstNum(i)) {
				System.out.println(i);
			}
		}
		
	}

}
