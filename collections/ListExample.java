package com.programming.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		s.add(1);
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");

		// for (String m : s) {
		// System.out.println(m);
		// }

		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}

		// System.out.println(s.get(3));
		// System.out.println(s.element());
		// s.remove("a");
		// System.out.println(s);
		// System.out.println(s.contains("a"));
	}

}
