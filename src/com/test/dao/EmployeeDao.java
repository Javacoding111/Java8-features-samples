package com.test.dao;

import java.util.Arrays;
import java.util.List;

import com.test.model.Employee;

public class EmployeeDao {
	
	public static List<Employee> getEmployees() {
		
		List<Employee> empList = Arrays.asList(new Employee(1, "Ram", "Testing", 20000),
				new Employee(2, "Raj", "Testing", 30000), new Employee(1, "Sravan", "Testing", 18000),
				new Employee(4, "Swarupa", "Development", 10000), new Employee(5, "Naveen", "Development", 5000));
		
		return empList;
	}

}
