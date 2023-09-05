package com.collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String [] args) {
		// Orders are not preserved
		HashMap<String , Integer> courses = new HashMap<String, Integer>();
		courses.put("Core Java", 2000);
		courses.put("Web-Development", 1000);
		courses.put("CPP1",2000);
		// Duplicate Keys are not allowed
		courses.put("Core Java", 1000);
		System.out.println(courses);
		
		courses.forEach((key, value)-> {
			System.out.println(key +"--> "+value);
		});
	}
}
