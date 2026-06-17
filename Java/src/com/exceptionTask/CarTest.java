package com.exceptionTask;

import java.util.Scanner;

class CarHeat extends Exception{
	public CarHeat(String msg) {
		super(msg);
	}
}
class CarPuncture extends Exception{
	public CarPuncture(String msg) {
		super(msg);
	}
}

class CarStopped extends Exception {
	public CarStopped(String msg) {
		super(msg);
	}
}


public class CarTest {
	public static void stop(String s) {
		try {
			if(s.equals("stop")) {
				throw new CarPuncture("car is stopped");
			}else {
				System.out.println("car not stalled");
			}
			
		} catch (Exception e) {
			System.out.println("Carstopped:"+e.getMessage());
		}
	}

	public static void puncture(String s) {
		try {
			if(s.equals("puncture")) {
				throw new CarPuncture("car is punctured");
			}else {
				System.out.println("car not punctured");
			}
			
		} catch (Exception e) {
			System.out.println("Carpuncture:"+e.getMessage());
		}
	}

	public static void carHeat(int temp) {
		try {
			if(temp>50) {
				throw new Exception("Car is heated more than 50 degrees");
			}else {
				System.out.println("car not stalled");
			}
		}catch(Exception e) {
			System.out.println("Carheat:"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter input: ");
		  String input = sc.next();
		  if (input.equalsIgnoreCase("stop")) {
	            stop(input);

	        } else{
	            puncture(input);
	        }

	}
}

