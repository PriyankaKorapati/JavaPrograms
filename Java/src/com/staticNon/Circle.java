package com.staticNon;

public class Circle {
	double radius;
	double pi=3.14;
	
	double Circumference() {
		return 2*pi*radius;
	}
	double Area() {
		return pi*radius*radius;
	}
    void initializeValues(double r) {
    		this.radius=r;
    }
    
    void display() {
    	    System.out.println("            ");
    		System.out.println("Circle");
    		System.out.println("----------------");
    		System.out.println("radius:"+radius+ 
    			" Circumference"+Circumference()+ 
    			" Area" +Area());
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//	public static void main(String[] args) {
//		Circle c1= new Circle();
//		c1.initializeValues(5.0);
//		c1.display();
//		
//	}

}
