package com.AtoZSheet.step1.lec1;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		// method 1 : using switch case
		switch (input) {
		case "Integer":
			System.out.println("4");
			break;
		case "Long":
			System.out.println("8");
			break;
		case "Float":
			System.out.println("4");
			break;
		case "Double":
			System.out.println("8");
			break;
		case "Character":
			System.out.println("2");
			break;
		default:
			System.out.println("-1");
		}
		// method 2 using hashmap
//		Map<String, String> dataTypeSize = new HashMap<>();
//		dataTypeSize.put("Integer", "4");
//		dataTypeSize.put("Long", "8");
//		dataTypeSize.put("Float", "4");
//		dataTypeSize.put("Double", "8");
//		dataTypeSize.put("Character", "1");
//
//		String output = dataTypeSize.getOrDefault(input, "-1");
//		System.out.println(output);

		// method 3 : using simple if else
//			if (input.equals("Integer")) {
//				System.out.println("4");
//			} else if (input.equals("Long")) {
//				System.out.println(8);
//			} else if (input.equals("Float")) {
//				System.out.println(4);
//			} else if (input.equals("Double")) {
//				System.out.println(8);
//			} else if (input.equals("Character")) {
//				System.out.println(1);
//			} else {
//				System.out.println(-1);
//			}

	}

}
