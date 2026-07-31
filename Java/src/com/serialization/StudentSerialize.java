package com.serialization;

import java.io.*;

class Student implements Serializable{
	int studentId;
	String studentName;
	String course;
	
	Student(int id,String name,String course){
		this.studentId=id;
		this.studentName=name;
		this.course=course;
	}
}

public class StudentSerialize {

	public static void main(String[] args) {
		try {
			Student s = new Student(101,"Rahul"," Java Full Stack");
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			fos.close();
			oos.close();
			
			System.out.println("Student object serialized successfully.");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
