package com.strings;

public class LogestCommonSuffix {

	public static void main(String[] args) {
		
		String[] s= {"Eating","Walking","Running","Sleeping","Studying"};
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new StringBuilder(s[i]).reverse().toString();
//			System.out.println(s[i]);
			
		}
		//find prefix
		String prefix=s[0];
		for (int i = 1; i < s.length; i++) {
			while(!s[i].startsWith(prefix)) {
				prefix=prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					System.out.println("");
					return;
				}
			}
		}
		String suffix=new StringBuilder(prefix).reverse().toString();
		System.out.println("suffix: "+suffix);
	}

}
