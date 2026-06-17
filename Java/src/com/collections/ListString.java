package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ListString {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		
//		list.add("priya");
//		list.add("ishu");
//		list.add("sruthi");
//		list.add("renu");
//		System.out.println(list);
//		
//		System.out.println(list.get(0));
//		list.add(3,"divya");
//		System.out.println(list);
//		list.set(3, "sanju");
//		System.out.println(list);
//		System.out.println(list.indexOf("sanju"));
//		System.out.println(list.lastIndexOf("renu"));
		
		ArrayList names = new ArrayList<>(Arrays.asList("raju","yashu","jashu"));
		list.addAll(names);
		System.out.println(list);
		
		Object[] a=list.toArray();
		System.out.println(Arrays.toString(a));
		
		Collections.sort(list);
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		 list.forEach(fruit -> System.out.print(fruit + " "));

		

	}

}
