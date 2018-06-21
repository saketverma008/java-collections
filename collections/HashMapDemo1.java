package com.programming.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 extends Thread {
	static HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	public void run() {
		try {
			hmap.put(3, "Raspberry");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		hmap.put(1, "Apple");
		hmap.put(2, "Banana");
		HashMapDemo1 demo = new HashMapDemo1();
		demo.start();
		for (Map.Entry m : hmap.entrySet()) {
			// Object s = o;
			// System.out.println(s);
			Thread.sleep(100);
		}
		System.out.println(hmap);
	}

}
/* static ConcurrentHashMap<Integer,String>cmap = new ConcurrentHashMap<Integer,String>();
 * would not have given any exception during run time*/
