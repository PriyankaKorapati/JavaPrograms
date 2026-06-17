package com.abstraction;

import java.util.Scanner;

abstract class Shapes{
	float area;
	abstract void input();
	abstract void calArea();
	void display() {
		System.out.println("Area: "+area);
	}
}

class Rectangle extends Shapes{
	int l,b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length: ");
		l=sc.nextInt();
		System.out.println("enter breadth: ");
		b=sc.nextInt();
	}

	void calArea() {
		area=l*b;
	}
}
class Square extends Shapes{
	int a;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter area: ");
		a=sc.nextInt();
	}

	void calArea() {
		area=a*a;
	}
		
}
class Circle extends Shapes{
	int r;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius: ");
		r=sc.nextInt();
	}

	void calArea() {
		area=3.14f*r*r;
	}
}

class AreaCal{
	void allowShape(Shapes s) {
		s.input();
		s.calArea();
		s.display();
	}
}
public class MainClass {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Square s1=new Square();
		Circle c1=new Circle();
		AreaCal a1=new AreaCal();
		a1.allowShape(r1);
		a1.allowShape(s1);
		a1.allowShape(c1);	
	}
}
