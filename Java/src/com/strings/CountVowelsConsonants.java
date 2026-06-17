package com.strings;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str="Java programming";
		String vowelsChar="";
		String consonChar="";
		
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			ch=Character.toLowerCase(ch);  
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowelsChar+=ch;
					vowels++;
				}
				else {
					consonChar+=ch;
					consonants++;
				}
			}
		}
		System.out.println("vowels: "+vowels);
		System.out.println("vowels count: "+vowelsChar);
		System.out.println("consonants: "+consonants);
		System.out.println("consonants count: "+consonChar);
		
	}

}
