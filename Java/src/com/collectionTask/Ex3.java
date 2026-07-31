package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex3 {

	public static void main(String[] args) {
		Collection<String> cart = new ArrayList<>();
		 cart.add("Milk");
	     cart.add("Sugar");
	     cart.add("Rice");
	     cart.add("Oil");
	     cart.add("Bread");
	     cart.add("Eggs");
	     cart.add("Salt");
	     cart.add("Tea");
	     
	     System.out.println("cart: "+cart);
	     System.out.println("is milk is available? : "+cart.contains("Milk"));
	     cart.remove("Sugar");
	     System.out.println("cart after removing sugar:"+cart);
	     
	     System.out.println("is cart empty: "+cart.isEmpty());
	     
	}

}
