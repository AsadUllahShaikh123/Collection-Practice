package com.collection;

import java.util.ArrayList;

public class Main {

	public static void main(String [] args) {
		// Type Safe Collection 
		
		ArrayList<String> names= new ArrayList<String> ();
		names.add("Asadullah");
		names.add("Azhar");
		names.add("Safdar");
		// duplicates are allowed in the ArrayList.
		names.add("Asadullah");
		
		// if we tried to add another type of data then we will get error
		// names.add(1); 
		System.out.println("Names :" + names);
		
		// we can also get the data by using index 
		
		System.out.println("Index 0 : " + names.get(0));
		
	}
}
