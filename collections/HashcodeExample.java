package com.programming.java.collections;

public class HashcodeExample {
	private String name;
	private int salary;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + salary;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeExample other = (HashcodeExample) obj;
		if (salary != other.salary)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
