package com.strings;

public class RemoveDuplicates {
	
	public static void RemoveDuplicates(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(ch==str.charAt(j)) {
				duplicate=true;
				break;
			}
			}
			if(duplicate==false) {
				res+=ch;
			}
		}
		System.out.println(res);
	}
	
	public static void removeDupMethod(String str) {
		String res="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(res.indexOf(ch)==-1) {
				res+=ch;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		String str="banana";
//		RemoveDuplicates(str);
		removeDupMethod(str);

	}
}
