package com.tasks;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex1 {
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		 
		return true;
	}
	public static void main(String[] args) {

		Predicate<Integer> nc = num ->{
				return isPrime(num);
		};
		int n=3;
		if(nc.test(n)){
			 System.out.println(n+" is prime");
		} 
		else {
			System.out.println(n+" is not prime");
		}
 
		Consumer<Character> cc = ch-> {
			int ascii=(int) ch;
			if(isPrime(ascii)) {
				System.out.println("ascii value of "+ch+ "("+ascii+")" +" is prime" );
				
			}
			else {
				System.out.println("ascii value of "+ch+ "("+ascii+")" +" is not prime");
			  }
		};
	 	cc.accept('P');

	}

}
