package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Swarupa";

		String reversedString = Stream.of(str).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining());

		System.out.println(reversedString);

//		System.out.println(new StringBuilder(str).reverse());
	}

}
