package com.programming.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("e", 500);
		//System.out.println(hm);

		// Set<Map.Entry<String, Integer>> st = hm.entrySet();

		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.print(m.getKey() + ":");
			System.out.println(m.getValue());
		}
		// Set set = hm.entrySet();
		System.out.println("With iterator");
		 Iterator itr = hm.entrySet().iterator();
		 while (itr.hasNext()) {
		 Map.Entry entry = (Map.Entry) itr.next();
		 System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
