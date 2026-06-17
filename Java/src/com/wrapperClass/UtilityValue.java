package com.wrapperClass;

public class UtilityValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=100;
		int i1=i.intValue();
		System.out.println(i1);
		byte b1=i.byteValue();
		System.out.println(b1);
		short s1=i.shortValue();
		System.out.println(s1);
		long l1 = i.longValue();
		System.out.println(l1);
		float f1 = i.floatValue();
		System.out.println(f1);
		Double d1 = i.doubleValue();
		System.out.println(d1);
		}

}


//for resuing the exissiting obj rather tham creating a new obj if the value is in betweeen given range 