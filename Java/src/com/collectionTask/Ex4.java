package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex4 {

	public static void main(String[] args) {
		Collection<String> semester1 = new ArrayList<>();
		Collection<String> semester2 = new ArrayList<>();
		
		  semester1.add("Maths");
	      semester1.add("Physics");
	      semester1.add("Chemistry");
	      semester1.add("Java");
	      semester1.add("English");

	      semester2.add("Biology");
	      semester2.add("Chemistry");
	      semester2.add("Java");
	      semester2.add("History");
	      semester2.add("Maths");
	      
	      semester1.removeAll(semester2);
	      System.out.println("semester 1 after removal: "+semester1);
	      System.out.println("semester 2: "+semester2);
	      
	      
	}

}
