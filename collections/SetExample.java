package com.programming.java.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		TreeSet<String> testSet = new TreeSet<String>();
		testSet.add("Saket");
		testSet.add("Rohit");
		testSet.add("Prateek");
		testSet.add("Puja");
		testSet.add("Pritu");
		testSet.add("Ankita");

		// Iterator<Integer> i = testSet.iterator();
		// while (i.hasNext()) {
		// System.out.println(i.hasNext());
		// }
		for (String a : testSet) {
			System.out.println(a);
		}
	//	System.out.println(testSet);
		//System.out.println(testSet.last());
		System.out.println(testSet.subSet("P", "Z"));
		System.out.println(testSet.contains("Aplaju"));
		
	}

}
