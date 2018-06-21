package com.programming.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesThroughCollection {
	public static void main(String[] args) {

		/*
		 * Set<Integer> l = new LinkedHashSet<Integer>(); l.add(1); l.add(2); l.add(3);
		 * l.add(2); l.add(1);
		 */
		String str = "saketverma";

		Set<Character> s = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}
		for (Character ch : s) {
			System.out.print(ch +" ");
		}
	}
}
