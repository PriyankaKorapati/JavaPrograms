package com.inheritance;


class Employee{
	int empId=832;
	String name="priya";
	void work() {
		System.out.println("status: " +name+ " is working good in company");
	}
}
class Training extends Employee {
	String sub="java";
	void teach() {
		System.out.println(name+ " is teaching");
	}
}
public class SingleInh {

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("emp id:" +e1.empId);
		System.out.println("emp name: " +e1.name);
		e1.work();
		Training t1=new Training();
		System.out.println("subject:" +t1.sub);
		t1.teach();
		

	}

}
