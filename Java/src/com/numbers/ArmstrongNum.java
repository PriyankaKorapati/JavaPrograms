package com.numbers;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		// count digits
		int count=0;
		int temp=n;
		while(temp>0) {
			count++;
			temp/=10;
		}
		System.out.println(count);
		// armstrong or not
		int original=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*digit;
			}
			sum+=power;
			n/=10;
	    }
			
		if(sum==original) {
			System.out.println("armstrong num");
		}else {
			System.out.println("not a armstrong num");
		}
		sc.close();
	}
}






















//package com.problems;
//
//import java.util.Scanner;
//
//public class ArmstrongNum {
//	
//	
//	public static int countDigit(int n) {
//		int count=0;
//		while(n>0) {
//			count++;
//			n/=10;
//		}
//		return count;
//		}
//
//		public static boolean isArmstrong(int n) {
//		int original=n;
//		int sum=0;
//		int digits=countDigit(n);
//		while(n>0) {
//			int digit=n%10;
//			int power=1;
//			for(int i=0;i<digits;i++) {
//				power=power*digit;
//			}
//			sum+=power;
//			n/=10;
//		}
//		return sum==original;
//			
//		}
//
//		public static void main(String[] args) {
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number: ");
//		int n=sc.nextInt();
//
//		if(isArmstrong(n)) {
//			System.out.println("armstrong num");
//		}else {
//			System.out.println("not a armstrong num");
//		}
//		sc.close();
//		}
//
//		}
//
//
//}
//
//

















