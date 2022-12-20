package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListBasedGender {

	public static void main(String[] args) {
		List<EmployeeWithGender> empList = Arrays.asList(new EmployeeWithGender(1, "Swarupa", "F"),
				new EmployeeWithGender(2, "Praveen", "M"), new EmployeeWithGender(3, "Nehanya", "F"),
				new EmployeeWithGender(4, "Bannu", "M"));
		
		Map<String, List<EmployeeWithGender>> genderListMap = empList.stream().collect(Collectors.groupingBy(EmployeeWithGender::getGender));
		
		Map<Object, Object> empNamesList = genderListMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().map(EmployeeWithGender::getName).collect(Collectors.toList())));
		System.out.println(empNamesList);
	}

}
