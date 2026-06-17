package com.functionalInterface;

import java.util.function.Predicate;

public class Palindrome {
	
	public static String isPalin(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Predicate<String> p = new Predicate<String>() {
		
			@Override
			public boolean test(String t) {
				String rev = isPalin(t);
				return t.equals(rev);
			}
		};
		System.out.println(p.test("madam"));
	}
}
