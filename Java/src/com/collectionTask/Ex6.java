package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex6 {

	public static void main(String[] args) {
		Collection<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Kiran");
        students.add("Sneha");
        students.add("Anil");
        students.add("Divya");

        System.out.println("Total Students: " + students.size());

        students.remove("Rahul");
        students.remove("Anil");

        System.out.println("Updated Students Count: " + students.size());

        students.clear();

        System.out.println("Is collection empty? " + students.isEmpty());

	}

}
