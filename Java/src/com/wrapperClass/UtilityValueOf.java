package com.wrapperClass;

public class UtilityValueOf {

	public static void main(String[] args) {
		// String to non- primitive datatype
		String s="3ydbbq2";
		Integer i=Integer.valueOf(s);
		System.out.println(i);
		Byte b=Byte.valueOf(s);
		System.out.println(b);
		Short s1=Short.valueOf(s);
		System.out.println(s1);
		Long l = Long.valueOf(s);
		System.out.println(l);
		Float f = Float.valueOf(s);
		System.out.println(f);
		Double d = Double.valueOf(s);
		System.out.println(d);
//		Character c=Character.valueOf(s.charAt(1));
//		System.out.println(c);
		
		
	}

}
