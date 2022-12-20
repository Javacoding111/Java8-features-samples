package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MultiplyArrayOfNumbers {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> result = numberList.stream().reduce((a,b) -> a*b);
		if(result.isPresent()) {
			System.out.println(result.get());
		}
	}

}
