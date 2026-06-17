package com.problems;

import java.util.Scanner;

public class PalinWithoutDiv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sc.nextLine();
		String res="";
		
		for(int i=0;i<str.length();i++) {
			res=str.charAt(i)+res;
		}
//		if(str.equals(res)) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not");
//		}
		System.out.println(str.equals(res));
	}

}
