package com.exceptions;

public class LoginVerfication {

	public static void login(String password) {
		if(!password.equals("1234")) {
			throw new IllegalArgumentException("invalid password");
		}
		System.out.println("login successful");
		
	}
	public static void main(String[] args) {
		login("1234");

	}

}
