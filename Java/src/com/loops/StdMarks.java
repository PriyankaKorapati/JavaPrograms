package com.loops;

public class StdMarks {
	int marks=95;

	public void grading() {
	
	if(marks<0 || marks>100) {
		System.out.println("Invalid marks");
	}
	else if(marks<=35){
		System.out.println(+marks+"Marks Fail");
	}
	else if(marks<=50){
		System.out.println(+marks+"Marks D Grade");
	}
	else if(marks<=75){
		System.out.println(+marks+"Marks C Grade");
	}
	else if(marks<=90){
		System.out.println(+marks+"Marks B Grade");
	}
	else {
		System.out.println(+marks+"Marks A Grade");
	}
}
	public static void main(String[] args) {
		StdMarks obj=new StdMarks();
		obj.grading();
}}
