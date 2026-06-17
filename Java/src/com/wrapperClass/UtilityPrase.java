package com.wrapperClass;

public class UtilityPrase {

	public static void main(String[] args) {
		// String to primitive datatype
		String s="3";
		int i=Integer.parseInt(s);
		System.out.println(i);
//		String s="abc";
//		int i=Integer.parseInt(s);
//		System.out.println(i);
		byte b=Byte.parseByte(s);
		System.out.println(b);
		short s1=Short.parseShort(s);
		System.out.println(s1);
		long l = Long.parseLong(s);
		System.out.println(l);
		float f = Long.parseLong(s);
		System.out.println(f);
		double d = Double.parseDouble(s);
		System.out.println(d);
		
		
		

	}

}

















/*
 * parse() used to converting string to pd
 * we can use parse method wrto all the wrapper class except char 
 * it is an static method
 * valueof-is an utility method which is used to covert string into non p datatype(wrapper class)
 * we can use valuof method wrto all the wrapper class except char 
 * ***value()-to convert from non primitive to primitive datatype we use value()
 * we can use value() wrto any primitive datatypes
 * 
 * == ->is used to checks the address of the obj
 * .equals()-> when
 * 
 * user input ph num is valid or not 
 * 
 * 
 */
