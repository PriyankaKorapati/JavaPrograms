package com.problems;

public class MethodTask {
	    // Static method
		static void calculate(int a, int b) {
	        System.out.println("Addition: " + (a + b));        
	        System.out.println("Subtraction: " + (a - b));     
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Division: " + (a / b));       
	        System.out.println("Modulus: " + (a % b));         
	    }

	    public static void main(String[] args) {
	        calculate(10, 5); 
	    }
}
