package com.staticNon;

public class Square {
	
	double side;	
	public void initializeValues(double s) {
		side=s;
		
	}
    double findPerimeter() {
    	return 4*side;
    		
    }	
	  double findArea() {
  		return side*side;
  }
	  void display() {
		  System.out.println("            ");
		  System.out.println("Square");
  	      System.out.println("----------------");
		  System.out.println("side of the squre:"+side+ 
				  " Perimeter:"+findPerimeter()+ 
				  " Area:"+findArea());
	  }
	
 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	public static void main(String[] args) {
//		
//		Square s1= new Square();
//		s1.initializeValues(5.0);
//		s1.display();
//	}

}



















