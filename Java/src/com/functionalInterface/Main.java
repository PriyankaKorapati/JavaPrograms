package com.functionalInterface;

@FunctionalInterface
interface NumberChecker{
	boolean checkNumber(int num);
}
 
@FunctionalInterface
interface CharChecker{
	void checkChar(char ch);
}
public class Main {
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
		NumberChecker nc = new NumberChecker() {
		@Override
		public boolean checkNumber(int num) {
			return isPrime(num);
		}
		};
		int n=3;
		if(nc.checkNumber(n)){
			 System.out.println(n+" is prime");
		} 
		else {
			System.out.println(n+" is not prime");
		}
		CharChecker cc = new CharChecker() {
		@Override
		public void checkChar(char ch) {
			int ascii=(int) ch;
			if(Main.isPrime(ascii)) {
				System.out.println("ascii value of "+ch+ "("+ascii+")" +" is prime" );
				
			}
			else {
				System.out.println("ascii value of "+ch+ "("+ascii+")" +" is not prime");
			  }
		   }
		};
	 	cc.checkChar('P');

	}

}
