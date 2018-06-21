package com.programming.java.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEg {
	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("A");
		pQueue.add("B");
		pQueue.add("C");
		pQueue.add("W");
		pQueue.add("Q");
		// System.out.println(pQueue);
		// System.out.println(pQueue.peek());
		// System.out.println(pQueue.element());
		pQueue.poll();
		Iterator itr = pQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
