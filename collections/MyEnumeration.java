package com.programming.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {
	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		Enumeration<String> en = null;
		vct.add("Java");
		vct.add("Php");
		vct.add("C++");
		vct.add("Python");
		Enumeration<String> s = vct.elements();
		while (s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}

	}

}
