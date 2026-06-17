package com.operators;

public class IncDecment {

	public static void main(String[] args) {
		int tokenNum=100;
		int stock=5;
		
		int currentToken=++tokenNum;
		System.out.println("current cust token:"+currentToken);
				
		int oldToken=tokenNum++;
		System.out.println("old token:"+oldToken);
		System.out.println("Token after Post-Increment: " + tokenNum);
		
		int updatedStock=--stock;
		System.out.println("after selling:"+updatedStock);
		
		int displayStock=stock--;
		System.out.println("display stock:"+displayStock);
		System.out.println(+stock);

	}
}
