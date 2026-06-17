package com.tasks;

import java.util.function.Consumer;
import java.util.function.Predicate;
class Employee{
	String empName,empDesg;
	double empSalary;
	
	public Employee(String empName,String empDesg,double empSalary) {
		this.empName=empName;
		this.empDesg=empDesg;
		this.empSalary=empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public double getSalary() {
		return empSalary;
	}
	
	public void setSalary(double salary) {
		this.empSalary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empSalary=" + empSalary + "]";
	}
}
public class Task {

	public static void main(String[] args) {
		
		Predicate<Employee> p = new Predicate<Employee>() {
			public boolean test(Employee emp) {
				return emp.getSalary()>10000;
			}
		};
		
		
		Consumer<Employee> c= new Consumer<Employee>() {

			@Override
			public void accept(Employee e) {
				e.setSalary(e.getSalary()+(e.getSalary()*0.10));
				System.out.println(e.getSalary());	
			}	
		};
		
		Employee emp1 = new Employee("priya","SE",50000.0);
		Employee emp2 = new Employee("ishu","SD",40000.0);
		Employee emp3 = new Employee("riya","SE",5000.0);
		Employee [] employes = {emp1,emp2,emp3};
		for(Employee i:employes) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
	}

}
