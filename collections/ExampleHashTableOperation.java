package com.programming.java.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ExampleHashTableOperation {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "My name is");
		ht.put("second", "Saket");
		ht.put("third", "Verma");
		// Set<Map.Entry<String, String>> st = ht.entrySet();
		// for (Map.Entry<String, String> me : st) {
		// System.out.println(me.getKey() + ":");
		// System.out.println(me.getValue());
		// }
		System.out.println(ht);
		ht.remove("third");
		System.out.println(ht);
		System.out.println("does it conatain" + ht.containsKey("second"));
	}
}
