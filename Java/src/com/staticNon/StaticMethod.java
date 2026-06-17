package com.staticNon;

public class StaticMethod {
	
		static void method1() {
			method2();
		}
		static void method2() {
			System.out.println("static inside static");
		}
		public static void main(String[] args) {
			method1();
}
	

}
