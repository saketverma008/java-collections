package com.programming.java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Saket");
		lhs.add("Svk");
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		lhs.removeAll(lhs);
		System.out.println("after removal :" +lhs);
	}

}
