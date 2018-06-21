package com.programming.java.collections;

import java.util.LinkedList;

public class ExampleRemoveOprLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		// System.out.println(list);
		// list.remove();
		// System.out.println(list);
		// list.removeFirst();
		// System.out.println(list);
		System.out.println(list.removeLastOccurrence("one"));
		System.out.println(list);
	}

}
