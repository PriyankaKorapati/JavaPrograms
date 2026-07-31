package com.serialization;

import java.io.*;

class Employee implements Serializable{
	int employeeId;
	String employeeName;
	double salary;
	
	Employee(int id,String name,double salary){
		this.employeeId=id;
		this.employeeName=name;
		this.salary=salary;
	}
}

public class EmployeMain {

	public static void main(String[] args) {
		try {
			//Serialization
			Employee e = new Employee(1001,"Ravi",45000);
			
			FileOutputStream fos = new FileOutputStream("employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e);
			
			fos.close();
			oos.close();
			
			//Deserialization
			FileInputStream fis = new FileInputStream("employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee)ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Employee ID :"+emp.employeeId+ " Employee Name:"+emp.employeeName+ " Salary:"+emp.salary);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
