package com.AtoZSheet.step1.lec1;

public class DecisionMakingIfElse {

	public static void main(String[] args) {
		checkingGreater(4, 8);
	}

	public static void checkingGreater(int n, int m) {
		if (n < m) {
			System.out.println("lesser");
		} else if (n > m) {
			System.out.println("greater");
		} else {
			System.out.println("equal");
		}
	}

}
