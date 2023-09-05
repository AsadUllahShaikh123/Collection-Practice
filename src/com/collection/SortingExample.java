package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String [] args) {
		// Sorting the Integers using the Collection API
		int [] numbers = {4,6,2,3,8,7} ;
		
		for(int number : numbers )
			System.out.print(number +" ");
		System.out.println();

		
		// ------ First Method --------
//		Arrays.sort(numbers);
//		for(int number : numbers)
//			System.out.print(number + " ");
		
		
		// ---- 2nd Method ------
//	    List<Integer> list = new ArrayList<>(Arrays.stream(numbers).boxed().toList());
//	    System.out.println("Before Sorting");
//	    System.out.println(list);
//	    Collections.sort(list);
//	    for(int number : list ) {
//	    	System.out.print(number+" ");
//	    }
	    
	    // ------ 3rd Method of Sorting --------
		
		List<Integer> list = new ArrayList<>();
		for(int number : numbers)
			list.add(number);
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}
}
