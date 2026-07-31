package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex1 {

	public static void main(String[] args) {
		Collection<String> emp = new ArrayList<>();
		
		emp.add("priya");
		emp.add("ishu");
		emp.add("rahul");
		emp.add("riya");
		emp.add("sanju");
		
		System.out.println("employees:" +emp);
		System.out.println("total empployees:" +emp.size());
		System.out.println("is rahul present: "+emp.contains("rahul"));
		emp.remove("rahul");
		System.out.println("after removal:" +emp);
		
	}

}
