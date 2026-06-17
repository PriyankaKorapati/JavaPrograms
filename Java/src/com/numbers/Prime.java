package com.numbers;

public class Prime {
//	public static boolean isPrime(int n) {
//
//		boolean isP=true;
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				isP=false;
//				break;
//			}
//		}
//		return isP;
//		
//	}
	public static void main(String[] args) {
		
		int n=2;
//		boolean isPrime=true;
//		for(int i=2;i<=num/2;i++) {
//			if(num%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		if(isPrime)
//			System.out.println("prime");
//		else
//			System.out.println("not prime");
		
		// print all prime nums
//		for(int i=2;i<=n;i++) {
//			if(isPrime(i)) {
//				System.out.println(i);
//			}
//       }
		
//		for(int i=2;i<=n;i++) {
//			int count=0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//		
//		if(count==2) {
//			System.out.print(i+" ");
//		}
//		}	
		
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}

		if(count==2) {
			System.out.println(n+"prime");
		}	else {
			System.out.println(n+"not a prime");
		}
		}
	}
}











