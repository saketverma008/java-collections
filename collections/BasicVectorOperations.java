package com.programming.java.collections;

import java.util.Vector;

public class BasicVectorOperations {
	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("one");
		vct.add("two");
		vct.add("three");
		vct.add("four");
		vct.remove("one");
		for (String a : vct) {
			System.out.println(a);
		}
		System.out.println("Element at index three :" + vct.get(2));
		System.out.println("the first element is:" + vct.firstElement());
		System.out.println("the last lement is:" + vct.lastElement());
		System.out.println("Is this vector empty:" + vct.isEmpty());
		/* to remove element */
		vct.removeElement(1);
		/* to clone */
		Vector<String> copy = (Vector<String>) vct.clone();
		System.out.println("Cloned array : " + copy);
		/* to copy into new array */
		String[] strArr = new String[vct.size()];
		//vct.copyInto(strArr);
		vct.toArray();
		System.out.println("Copied array : ");
		for (String str : strArr) {
			System.out.println(strArr);
		}
	}

}
