package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.model.Employee;

public class FetchEmployeesInThatCity {

	public static void main(String[] args) {
		List<EmployeeWithCity> empList = Arrays.asList(new EmployeeWithCity(1, "Swarupa", "Hyderabad"),
				new EmployeeWithCity(2, "Naveen", "Banglore"), new EmployeeWithCity(3, "Murthy", "Hyderabad"),
				new EmployeeWithCity(4, "Pavan", "Banglore"));
		Map<String, List<EmployeeWithCity>> empCityMap = empList.stream()
				.collect(Collectors.groupingBy(EmployeeWithCity::getCity));
		Map<String, List<String>> empNamesMap = empCityMap.entrySet().stream().collect(Collectors.toMap(
				Map.Entry::getKey, e -> e.getValue().stream().map(emp -> emp.getName()).collect(Collectors.toList())));
		System.out.println(empNamesMap);
	}

}
