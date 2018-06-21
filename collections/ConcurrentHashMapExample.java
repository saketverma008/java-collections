package com.programming.java.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> cmap = new ConcurrentHashMap<Integer, String>();
		cmap.put(2, "Apple");
		cmap.put(1, "Bananas");
		// System.out.println(cmap);
		Iterator itr = cmap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry map = (Map.Entry) itr.next();
			cmap.put(3, "rasp");
			System.out.println(map.getKey() + " " + map.getValue());
		}
		/* to get only keys */
		//Set<Integer> key = cmap.keySet();
		//for (Integer k : key) {
			//System.out.println(k);
		//}
		/* to get values */
		System.out.println();
		Collection<String> values = cmap.values();
		for (String k : values) {
		System.out.println(k);
		}
		//TreeMap<Integer, String> tmap = new TreeMap<>(cmap);
		//tmap.putAll(cmap);
		//System.out.println(tmap);
		
	}
}
