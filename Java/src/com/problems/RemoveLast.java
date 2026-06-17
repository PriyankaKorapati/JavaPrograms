package com.problems;

import java.util.Scanner;

public class RemoveLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sc.nextLine();
		String res="";
		for(int i=0;i<str.length()-1;i++) {
			res=res+str.charAt(i);
		}
		System.out.println(res);

	}

}
