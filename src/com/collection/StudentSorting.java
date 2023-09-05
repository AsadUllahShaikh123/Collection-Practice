package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorting {

	public static void main(String [] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Asad",21));
		students.add(new Student(5,"Azhar",29));
		students.add(new Student(2,"Safdar",18));
		students.add(new Student(3,"Mazhar",15));
		students.add(new Student(12,"Asad ullah",28));
		// By Using Comparable we can only sort by one type 
		Collections.sort(students);
		System.out.print(students);
		System.out.println("\n ---- By ID ----- ");
		Collections.sort(students,new IdComparator());
		System.out.println(students);
		System.out.println("\n ---- By Name -----");
		Collections.sort(students, new NameComparator());
		System.out.println(students);	
		System.out.println("\n ---- By Age -----");
		Collections.sort(students, new AgeComparator());
		System.out.println(students);	
	}
}
