package com.staticNon;

public class Rectangle {	
	double length;
	double breadth;
	
	public void initializeValues(double l,double b){
		length=l;
		breadth=b;
	}
    double findPerimeter() {
    	return 2*(length+breadth);
    		
    }	
	double findArea() {
  		return length*breadth;
  }	

    void displayDetails() {
    	    System.out.println("Rectangle");
    	    System.out.println("----------------");
    		System.out.println("Length:"+length+
    			", Breadth:"+breadth+
    			", Perimeter:" +findPerimeter()+
    			", Area:" +findArea());
    	
    }
}









//	public static void main(String[] args) {		
//		Rectangle rec= new Rectangle();
//		rec.initializeValues(10,5);
//		rec.displayDetails();
//	}


//void findPerimeter(){
//	double perimeter=2*(length+breadth);
//	System.out.println(" Perimeter:"+perimeter);
//}
//void findArea(){
//double area =length*breadth;
//System.out.println(" Area:"+area);
//}
//System.out.println("Length:"+length+
//		",Breadth:"+breadth);
//	findPerimeter();
//	findArea();

