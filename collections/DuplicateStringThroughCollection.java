package com.programming.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateStringThroughCollection {
	public static void main(String[] args) {
		String[] str = { "abc", "def", "abc", "ghi" };
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		for (String a : str) {
			if (hmap.containsKey(a)) {
				System.out.println("Duplicate string is: " + a);
			} else {
				hmap.put(a, 1);
			}
		}
		Iterator itr = hmap.entrySet().iterator();
		 while (itr.hasNext()) {
		 Map.Entry entry = (Map.Entry) itr.next();
		 System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
