package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;

public class HighestSalaryFromEachDepartment {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();

		// approach 1
		Map<String, Optional<Employee>> groupMap = empList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		groupMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +"," + entry.getValue().get()));
		
		//approach 2
//		Map<String, Employee> empMap = empList.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
//						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
//		System.out.println(empMap);
		
		//approach 3
//		Map<String, Optional<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
//		System.out.println(empMap);
	}

}
