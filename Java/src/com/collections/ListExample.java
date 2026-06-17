package com.collections;

import java.util.List;
import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(null);
		
		list.add(1,40);
		System.out.println(list); //[10,40,20,20,null]
		System.out.println(list.get(2)); //20
		list.set(2, 30);
		System.out.println(list);//[10,40,30,20,null]
		list.remove(1);
		System.out.println(list);//[10,30,20,null]
		System.out.println(list.get(3));//null
		
		
		
	}

}

/*
 * without generics
 * List list=new ArrayList();
   list.add("priya");
   String s=(String) list.get(0);
   System.out.println(s);
 */












