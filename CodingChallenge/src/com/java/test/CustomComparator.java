package com.java.test;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getAddress().getZipcode().compareTo(o2.getAddress().getZipcode()) == 0) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getAddress().getZipcode().compareTo(o2.getAddress().getZipcode());
		}

	}

}
