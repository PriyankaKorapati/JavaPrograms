package com.loops;

public class GradeToMarks {

	public static void main(String[] args) {

		char grade='a';
		if(grade=='A'|| grade=='B' || grade=='C' || grade=='D' || grade=='F'||
				grade=='a'|| grade=='b' || grade=='c' || grade=='d' || grade=='f') {
		if(grade=='A' || grade=='a') {
			System.out.println("91-100");
		}
		else if(grade=='B' || grade=='b') {
			System.out.println("76-90");
		}
		else if(grade=='C'|| grade=='c') {
			System.out.println("51-75");
		}
		else if(grade=='D'|| grade=='d') {
			System.out.println("36-50");
		}
		else {
			System.out.println("0-35");
		}
		}
	else {
		System.out.println("invalid");
	}
}
}
