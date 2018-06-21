package com.programming.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BasicLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("a", "I love making tea");
		lhm.put("b", "I love making maggi");
		lhm.put("c", "I love making chicken");
		Set<Map.Entry<String, String>> st = lhm.entrySet();
		for (Map.Entry<String, String> me : st) {
			System.out.println(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		// System.out.println("Getting value for key 'a': " + lhm.get("a"));

	}

}
