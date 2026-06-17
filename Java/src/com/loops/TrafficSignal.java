package com.loops;

public class TrafficSignal {

	public static void main(String[] args) {
		String signal="green";
		switch(signal) {
			case "red":
				System.out.println("Stop");
				break;
			case "green": 
				System.out.println("Move");
				break;
			case "yellow": 
				System.out.println("Ready to go");
				break;
			default:
				System.out.println("Invalid signal");
		}
//		int i = 1;
//
//		while(i <= 5){
//		    System.out.println(i);
//		    i++;
//		}
		
//		int i = 1;
//
//		do{
//		    System.out.println(i);
//		    i++;
//		}while(i < 5);
	}

}
