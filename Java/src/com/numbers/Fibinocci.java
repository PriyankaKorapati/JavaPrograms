package com.numbers;

import java.util.Scanner;

public class Fibinocci {	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number: ");
	int n=sc.nextInt();

	int a=0,b=1;
	System.out.print("fibinocci series:" +a+" "+ b+" ");
	for(int i=2;i<=n;i++) {
		/*
		 * a=prev num, b=curr num 
		 * after find c, curr becomes next and next num becomes curr num
		 */
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}

}
}
