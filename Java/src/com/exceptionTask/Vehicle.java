package com.exceptionTask;


class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String msg) {
		super(msg);
	}
}

class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String msg) {
		super(msg);
	}
}

class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String msg) {
		super(msg);
	}
}

public class Vehicle {
	public static void checkage(int ageOfVehicle , int ageOfTire , int ageOfEngine) 
			throws InvalidAgeOfVehicleException, InvalidAgeOfTireException, InvalidAgeOfEngineException {
		if(ageOfVehicle>10) {
			throw new InvalidAgeOfVehicleException("greater than 10 years vehicles are not allowed.");
		}
		
		if(ageOfTire>2) {
			throw new InvalidAgeOfTireException("greater than 2 years tires are not allowed.");
		}
		
		if(ageOfEngine>15) {
			throw new InvalidAgeOfEngineException("greater than 15 years engines are not allowed.");
		}
		System.out.println("All ages are valid");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		try {
			v.checkage(5, 1, 10);
		}
		catch (InvalidAgeOfVehicleException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidAgeOfTireException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidAgeOfEngineException e) {
			System.out.println(e.getMessage());
		}

	}

}
