package com.staticNon;
class Employee {
	int employeeId;
	String name;
	double monthlySalary;
	Employee(int id,String empName,double salary){
		employeeId=id;
		name=empName;
		monthlySalary=salary;
		}
	double calculateAnnualSalary() {
		return monthlySalary*12;
	}
	void displayEmployeeDetails() {
		System.out.println("Employee ID:" +employeeId+
				" Name:"+name+ 
				" Monthly_salary:"+monthlySalary+ 
				" Annual_salary:"+calculateAnnualSalary());
	}	
	public static void main(String[] args) {		
		Employee e1=new Employee(201,"priya",50000);
		Employee e2=new Employee(202,"sheela",45000);
		Employee e3=new Employee(203,"renu",400000);
		Employee e4=new Employee(204,"divya",33000);
		Employee e5=new Employee(205,"sanju",70000);	
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		e3.displayEmployeeDetails();
		e4.displayEmployeeDetails();
		e5.displayEmployeeDetails();
	}
}

