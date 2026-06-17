package com.problems;

public class Student {
	private int id;
	private String name;
	private int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	public String calGrade() {
		if(marks>=90) {
			return "A";
		}
		else if(marks>=75){
			return "B";
		}else {
			return "F";
		}
	}
	public void display() {
		System.out.println("id:"+id+
				"\nname:"+name+
				"marks"+marks+
				"grade:"+calGrade());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(101,"priya",91);
		s.display();
	}

}
