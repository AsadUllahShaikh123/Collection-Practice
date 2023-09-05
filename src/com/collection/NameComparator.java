package com.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		// by default it compares with the string 
//		return  o1.compareTo(o2);
		return o1.getName().compareTo(o2.getName());
	}

}
