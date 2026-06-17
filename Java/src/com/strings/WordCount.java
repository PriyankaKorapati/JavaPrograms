package com.strings;

public class WordCount {

	public static void main(String[] args) {
		String s="java is programming language";
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch!=' ' && (i==0 || s.charAt(i-1)==' ')) {
				count++;
			}
		}
		System.out.println("word count: "+count);

	}

}
