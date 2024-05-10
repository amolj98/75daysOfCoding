package com.dailyJavaCode;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Orange", "Mango");

//		printBasic(list);
//		printWithFp(list);
		printWithFiltering(list);

	}

//	private static void printBasic(List<String> list) {
//		for (String fruits : list) {
//			System.out.println(fruits);
//		}
//	}
//
//	private static void printWithFp(List<String> list) {
//		list.stream().forEach(element -> System.out.println(element));
//	}

	private static void printWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("e")).forEach(element -> System.out.println(element));
	}

}
