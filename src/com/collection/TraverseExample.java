package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("AsadUllah");
		names.add("Azhar");
		names.add("Safdar");
		names.add("Mazhar");

		// ---> 1) for each loop present in iterable so it means every collection class
		// can use it
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
		// ---> 2) Using Iterator only forward traversing
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.print(item + ", ");
		}
		System.out.println();
		// ---> 3) ListIterator
		ListIterator<String> listIterator = names.listIterator();
		while (listIterator.hasNext()) {
			String item = listIterator.next();
			System.out.print(item + ", ");
		}
		System.out.println();
		// for Reverse Traversing 
		listIterator = names.listIterator(names.size());
		while(listIterator.hasPrevious()) {
			String item = listIterator.previous();
			System.out.print(item + ", ");
		}
		System.out.println();
		// ---> 4) using For Each Method 
		names.forEach( name -> {
			System.out.print(name+", ");
		});
		
		// Sorting of Names 
		System.out.println();
		System.out.println("----- Sorting of Names ----- ");
		TreeSet<String> set = new TreeSet<String>();
		set.addAll(names);
		
		set.forEach(e -> {
			System.out.print(e +", ");
		});
		

	}
}
