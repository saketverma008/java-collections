package com.programming.java.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
	public static void main(String[] args) {
		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(1, "Apple");
		nmap.put(2, "Pineapple");
		nmap.put(5, "Raspberry");
		nmap.put(4, "Mango");
		nmap.put(3, "Kiwi");

		System.out.println(nmap.headMap(3));
		System.out.println(nmap);
	}
}
