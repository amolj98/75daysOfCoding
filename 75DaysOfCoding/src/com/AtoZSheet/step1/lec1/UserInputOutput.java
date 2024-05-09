package com.AtoZSheet.step1.lec1;

import java.util.Scanner;

public class UserInputOutput {

	public static void main(String[] args) {
//		Problem statement
//		Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
//		1, if the character is an uppercase alphabet (A - Z).
//		0, if the character is a lowercase alphabet (a - z).
//		-1, if the character is not an alphabet.

		Scanner scanner = new Scanner(System.in);
		char input = scanner.nextLine().charAt(0);

		if (Character.isUpperCase(input)) {
			System.out.println(1);
		} else if (Character.isLowerCase(input)) {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}

	}

}
