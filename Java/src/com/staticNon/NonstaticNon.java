package com.staticNon;

public class NonstaticNon {
	void method1() {
		method2();
	}
	void method2() {
		System.out.println("nonstatic inside nonstatic");
	}
	

	public static void main(String[] args) {
		NonstaticNon obj =new NonstaticNon();
		obj.method1();
		

	}

}
