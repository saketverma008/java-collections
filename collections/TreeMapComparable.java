package com.programming.java.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Empl {
	private String name;
	private int salary;

	public Empl(String nm, int slry) {
		this.name = nm;
		this.salary = slry;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}

class MySalaryComparison implements Comparator<Empl> {
	public int compare(Empl e1, Empl e2) {
		if (e1.getSalary() > e2.getSalary())
			return 1;
		else
			return -1;
	}

	class MyNameComparison implements Comparator<Empl> {
		public int compare(Empl e1, Empl e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}

}

public class TreeMapComparable {
	public static void main(String[] args) {
		TreeMap<Empl, String> tmap = new TreeMap<Empl, String>(new MySalaryComparison());
		tmap.put(new Empl("Ram", 3000), "RAM");
		tmap.put(new Empl("Ankit", 6000), "ANKIT");
		Set<Empl> keys = tmap.keySet();
		for (Empl key : keys) {
			System.out.println(" " + tmap.get(key));
		}
	}
}
