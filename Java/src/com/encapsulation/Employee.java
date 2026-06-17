package com.encapsulation;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public int getEmpId() {
		return empId;
	} 
	public void setEmpId(int empId) {
		if(empId>0) {
			this.empId = empId;
		}
		else {
			System.out.println("Invalid emp ID");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}
		else {
			System.out.println("Invalid Name");
		}
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(checkSalary(salary)) {
			this.salary = salary;
		}
		else {
			System.out.println("you only work for that Salary");
		}
	}
	private boolean checkSalary(double salary) {
		return salary>=15000;
	}
	
	public void hikeSalary() {
		if(salary>0) {
			salary+=5000;
			System.out.println("salary hiked successfully");
		}else {
			System.out.println("salary not set");
		}
	}
	public void display() {
		System.out.println("Employee ID : " + empId+
				"\nEmployee Name : " + name+
				"\nEmployee Salary : " + salary+
				"\nEmployee Salary After Hike : " + salary);	
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(832);
		emp.setName("Priya");
		emp.setSalary(50000);
		System.out.println("before hike");
		System.out.println("------------------");
		emp.display();
		System.out.println("\nafter hike");
		System.out.println("------------------");
		emp.hikeSalary();
		emp.display();
	}
}






















