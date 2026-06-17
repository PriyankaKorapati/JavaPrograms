package com.interfaces;

interface Shape{
	void draw();
}
class Rectangle implements Shape{

	public void draw() {
		System.out.println("rectangle drawn");		
	}
}
class Square implements Shape{

	public void draw() {
		System.out.println("Square drawn");
		
	}
}
class Circle implements Shape{

	public void draw() {
		System.out.println("circle drawn");
		
	}
}
class AllowDraw{
	void display(Shape s) {
		s.draw();
	}
}
public class Task {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Square s1=new Square();
		Circle c1=new Circle();
		AllowDraw a=new AllowDraw();
		a.display(r1);
		a.display(s1);
		a.display(c1);

	}

}
