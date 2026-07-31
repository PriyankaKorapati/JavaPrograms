package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex2 {

	public static void main(String[] args) {
		Collection<String> javaStudents = new ArrayList<>();
		Collection<String> pythonStudents = new ArrayList<>();
		
		 javaStudents.add("Amit");
	     javaStudents.add("Neha");
	     javaStudents.add("Ravi");
	     javaStudents.add("Pooja");
	     javaStudents.add("Vikram");

	     pythonStudents.add("Kavya");
	     pythonStudents.add("Rahul");
	     pythonStudents.add("Meena");
	     pythonStudents.add("Arjun");
	     pythonStudents.add("Divya");
		 
	     javaStudents.addAll(pythonStudents);
	     System.out.println("final students list: "+javaStudents);
	     System.out.println("total students: "+javaStudents.size());
	}

}
