package com.serialization;

import java.io.*;

public class StudentDeserialize {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s = (Student)ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Student ID:"+s.studentId+ " StudentName:"+s.studentName+ " Course:"+s.course);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
