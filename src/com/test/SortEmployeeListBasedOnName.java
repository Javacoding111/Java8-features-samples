package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;

public class SortEmployeeListBasedOnName {
	
	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();
		List<String> nameSortedList = empList.stream().sorted(Comparator.comparing(Employee::getName)).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(nameSortedList);
		
		List<String> nameReverseSortedList = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(nameReverseSortedList);
		
		//Multi Compare using thenComparing
		List<String> multiCompare = empList.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(multiCompare);
		
	}
}
