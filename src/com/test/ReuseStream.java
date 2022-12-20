package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "def", "abc", "ghi");
		Stream<List<String>> streamList  = Stream.of(list);
//		streamList.forEach(System.out::println);
		//gives error as we already used the stream if we want to reuse the stream we need to use supplier
//		streamList.forEach(System.out::println);
		
		Supplier<Stream<List<String>>> supplierStream = () -> Stream.of(list);
		supplierStream.get().forEach(System.out::println);
		supplierStream.get().forEach(System.out::println);
	}

}
