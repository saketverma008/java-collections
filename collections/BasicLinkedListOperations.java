package com.programming.java.collections;

import java.util.LinkedList;

public class BasicLinkedListOperations {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");
		ll.addFirst("Saket");
		System.out.println(ll);
		System.out.println("Size of the linked list: " + ll.size());
		System.out.println("Is LinkedList empty? " + ll.isEmpty());
		System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
		/* to clone is same as arraylist */
		/* to addall is same as arraylist */
		/* to delete/clear is same as arraylist */
		/* to copy is same as arraylist */
		/* to get sublist is same as arraylist */
		/* to reverse element is same as arraylist */
		/* to use addlast, offerlast,offer */
		ll.addLast("Dragon Fruit");
		ll.offerLast("Rasp Berry");
		ll.offer("Pineapple");
		System.out.println(ll);
		System.out.println("first element" + ll.getFirst());
		System.out.println("first element" + ll.getLast());
		
	}
}
