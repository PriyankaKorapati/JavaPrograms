package com.wrapperClass;

public class Manual {

	public static void main(String[] args) {
		System.out.println("Manual boxing");
		
		int a=10;
		System.out.println(a);
		Integer i=new Integer(a);
		System.out.println(i.toString()+ " "+10);
		
		System.out.println("\nManual Unboxing");
		
		Integer a1=30;
		System.out.println(a1);
		int i1=Integer.valueOf(a1);
		System.out.println(i1);
	}

}
