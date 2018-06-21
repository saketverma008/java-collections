package com.programming.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		ListIterator<Integer> ltr = li.listIterator();
		while (ltr.hasNext()) {
			System.out.print(ltr.next()+" ");
		}
		System.out.println(" ");
		while (ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
	}
}
