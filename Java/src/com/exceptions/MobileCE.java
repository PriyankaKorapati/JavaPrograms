package com.exceptions;


class InvalidMobileNumber extends Exception{
	public String getMessage() {
		return "Invalid number";
	}
}
public class MobileCE {

	public static void main(String[] args) {
		String mobNum="9p38185626";
		try {
			if(mobNum.length()!=10 || !mobNum.matches("\\d{10}")) {
				throw new InvalidMobileNumber();
			}
			System.out.println("valid number");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
