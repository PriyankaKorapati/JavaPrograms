package com.strings;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		String[] s= {"Flower","Flow","Floor","Float"};
		String shortest=s[0];
		String prefix="";
		//finding shorest length elet
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<shortest.length()) {
				shortest=s[i];
			}
		}
		for (int i = 0; i < shortest.length();i++) {
			int count=0;
			for (int j = 0; j < s.length; j++) {
				if(shortest.charAt(i)==s[i].charAt(i)) {
					count++;
				}
			}
			if(count==s.length) {
				prefix+=shortest.charAt(i);
			}else {
				break;
			}
		}
		System.out.println(prefix.length()>0?prefix:"nothing");
	}

}
