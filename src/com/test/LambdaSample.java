package com.test;

public class LambdaSample {
	
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo FIDemo = (s1,s2) ->  s1 +" . " +s2;
		System.out.println(FIDemo.addString("abc", "def"));
	}

}
