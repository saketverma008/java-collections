package com.programming.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListOperation {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("JAVA");
		lst.add("PYTHON");
		lst.add("PHP");
		lst.add("LINUX");
		lst.remove("JAVA");
		// for (String a : lst) {
		// System.out.println(a);
		// }
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Element at index 1:" + lst.get(1));
		System.out.println("Does the list contain PYTHON?" + lst.contains("PYTHON"));
		System.out.println("Is the arraylist empty?" + lst.isEmpty());
		System.out.println("Index of PHP: " + lst.indexOf("PHP"));
		lst.add(2, "SAKET");
		lst.add("Shubham");
		System.out.println(lst);
		/* to clone */
		ArrayList<String> copy = (ArrayList<String>) lst.clone();
		System.out.println(copy);
		/* to reverse */
		Collections.reverse(lst);
		System.out.println("Reversed arraylist : " + lst);
		/* sublist */
		List<String> lst1 = lst.subList(2, 4);
		System.out.println(lst1);
		/* to swap two elements */
		Collections.swap(lst, 2, 3);
		System.out.println(lst);

		Collections.sort(lst);
		System.out.println(lst);
	}
}
