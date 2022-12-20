package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecyOfEachCharacter {
	
	public static void main(String[] args) {
		String str = "fdsfedsdsdsaasafhre";
		Map<String, Long> map = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(System.out::println);
	}

}
