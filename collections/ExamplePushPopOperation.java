package com.programming.java.collections;

import java.util.LinkedList;

public class ExamplePushPopOperation {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Patna");
		System.out.println(list);
		list.push("Push Statement");
		System.out.println(list);
		list.pop();
		System.out.println(list);
	}

}
