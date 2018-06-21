package com.programming.java.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sak");
		ts.add("Tak");
		ts.add("Abc");
		for (String a : ts) {
			System.out.println(a);
		}
		ts.size();
		System.out.println("Size :" + ts.size());
		
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	System.out.println("lowest element : "+ts.first());	
	System.out.println("descending iterator : "+ts.descendingSet());
	}
}
