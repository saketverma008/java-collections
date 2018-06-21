package com.programming.java.collections;

import java.util.*;

class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("Saket", 5);
		tmap.put("Abhishek", 10);
		tmap.put("Bruno", 2);
		System.out.println(tmap);
		Set<String>keySet = tmap.keySet();
		System.out.println(keySet);
		Collection<Integer>values = tmap.values();
		System.out.println(values);
	}
}
