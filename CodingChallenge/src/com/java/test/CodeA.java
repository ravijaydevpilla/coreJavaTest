package com.java.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodeA {

	public static void main(String[] args) {
		
		//Creating five unique objects for employee
		Employee e1 = new Employee(1, "Ravi", 
				new Address(1001, "8001 Mandan Rd", "Greenbelt", "Maryland", 20770));
		Employee e2 = new Employee(4, "Manisha", 
				new Address(1002, "7816 Hanover Parkway", "Greenbelt", "Maryland", 20770));
		Employee e3 = new Employee(3, "Jimit", 
				new Address(1003, "8001 Mandan Rd", "Greenbelt", "Maryland", 20770));
		Employee e4 = new Employee(5, "Akshay", 
				new Address(1004, "369 Manning Blvd", "Albany", "New York", 12206));
		Employee e5 = new Employee(2, "Rajasi", 
				new Address(1005, "369 Manning Blvd", "Albany", "New York", 12206));
	
		//Arrays.asList is used as I will not be modifying(add/remove) the list later
		/* The Arrays.asList is assigned to the List interface instead instead of 
		 * ArrayList as it is a good practice to save a data structure to its 
		 * interface as it is easier to convert it to a different type of collection later.		 */
		
		List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
		
		System.out.println("\nSorting the employees using Comparable(Employee ID)");
		
		/*When the sort(list) constructor is called, it looks for the compareTo() of the Comparable interface.
		 * I have defined a compareTo() in the Employee class and sorted the objects 
		 * using their employee id in ascending order.
		 */
		
		Collections.sort(employeeList);
		
		
		employeeList.forEach(System.out::println);
		
		System.out.println("\nSorting the employees using Comparator(by zipcode, if zipcode equal, then by employee name)");
		
		/*I have created a CustomComparator class which implements the Comparator interface
		 * and compares the objects by their zipcode, if the zipcode is same , then teh sorting is done by the employee name
		 * in ascending order.
		 */
		Collections.sort(employeeList, new CustomComparator());
		
		employeeList.forEach(System.out::println);

		//Creating a HashSet and assigning it to its interface is a good practice
		Set<Employee> employeeSet = new HashSet<>();
		
		//Adding five unique objects
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		
		/*I have overrided the equals() and hashcode() of Object class to accept objects that have
		 * unique employee names. If two objects have same employee names, then the 
		 * duplicate items are discarded
		 */
		Employee e6 = new Employee(6, "Ravi", 
				new Address(1007, "8001 Mandan Rd", "Greenbelt", "Maryland", 20770));
		//employeeSet doesn't accept this object as it has a duplicate field called 'name'.
		employeeSet.add(e6);
		
		System.out.println("\nEmployeeSet");
		employeeSet.forEach(System.out::println);
		
		/*Filtering for id > 3
		 * I have used the filter() of Stream where I have used a Lambda expression as the 
		 * Predicate of filter(). And then I had the filtered stream collected using the toList() of the Collectors class as list and 
		 * assigned it to a new list called filteredList
		 */
		List<Employee> filteredList = employeeSet
		.stream()
		.filter(o1 -> (o1.getEid() > 3))
		.collect(Collectors.toList());
		
		System.out.println("\nFiltered List (id > 3)");
		filteredList.forEach(System.out::println);
	}
}
