package com.inheritance;


class Person{
	String name="priya";
	void speak() {
		System.out.println(name+ " is speaking");
	}
}

class Traning extends Person{
	String sub="java";
	void teach() {
		System.out.println(name+ " is " +sub+" teaching");
	}
}

class javaProgram extends Traning {
	void javaWorkshop() {
		System.out.println(name+" is doing " +sub+ " workshop");
	}
}
public class MultipleInh {
	public static void main(String[] args) {
		javaProgram jp = new javaProgram();
		jp.teach();
		jp.javaWorkshop();
		
//		System.out.println(jp.sub);
//		System.out.println(jp.name);
		
	}

}
