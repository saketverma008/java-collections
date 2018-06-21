package com.programming.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("Bhalo");
		vct.add("Canada");
		vct.add("More");
		vct.add("Hockey");
		Iterator<String> itr = vct.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
