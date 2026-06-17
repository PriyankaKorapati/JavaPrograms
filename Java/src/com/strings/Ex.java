package com.strings;

public class Ex {

	public static void main(String[] args) {
		String s="ABCDEF";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
//				System.out.println(s.substring(i, j+1));
				String sub=s.substring(i, j+1);
				if(sub.length()==4) {
					System.out.println(sub);
				}
		}

	}

}
}
