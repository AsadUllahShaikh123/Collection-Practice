package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

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
		
		// Unsafe collection 
		LinkedList ages = new LinkedList();
		ages.add(1);
		ages.add(2);
		ages.add(5);
		ages.add(true);
		ages.add("hello");
		System.out.println("Ages : " +ages);
		
		// HashSet Order is not preserved 
		// not indexed and not allow duplicates
		
		HashSet <Double> set = new HashSet<Double>();
		set.add(1.4);
		set.add(5.8);
		set.add(1.5);
		set.add(4.3);
		set.add(8.0);
		System.out.println("Set Values : " + set);
		// it will count the duplicated items as one while getting the size. 
		System.out.println("Size : " + set.size());
		
		// TreeSet works as HashSet but with sorting 
		
		TreeSet<Double> tree = new TreeSet<Double>();
		tree.addAll(set);
		System.out.println("Tree : "+  tree);
		
		
	}
}
