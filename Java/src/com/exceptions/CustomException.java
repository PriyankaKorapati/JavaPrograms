package com.exceptions;


class ALessThanBException extends Exception{
	public String getMessage() {
		return "a is lessthan b, so neg values not allowed";
	}
}


public class CustomException {

	public static void main(String[] args) {
		int a=15,b=10;
		try {
			if(a<b) {
				throw new ALessThanBException();
			}
			int c=a-b;
			System.out.println(c);
		} catch (ALessThanBException e) {
			System.out.println(e.getMessage());
		}
	}
}
