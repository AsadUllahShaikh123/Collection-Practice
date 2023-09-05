package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetComparatorExample {

	public static void main(String [] args) {
		Set<Student> set = new TreeSet<>(new IdComparator());
		set.add(new Student(1,"Asad",12));
		set.add(new Student(2,"Azhar",13));
		set.add(new Student(4,"Asadullah",23));
		
		System.out.print(set);
	}
	
}
