package com.AtoZSheet.step1.lec1;

import java.util.List;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		List<Double> arr = List.of(3.0, 4.0);
		double result = switchCase(1, arr);
		System.out.println("Result :" + result);
	}

	static double switchCase(int choice, List<Double> arr) {
		// code here
		double ans = 0;
		switch (choice) {
		case 1:
			ans = (Math.PI * arr.get(0) * arr.get(0));
			break;
		case 2:
			ans = arr.get(0) * arr.get(1);
			break;

		}
		return ans;
	}

}
