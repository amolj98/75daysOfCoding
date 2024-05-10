package com.dailyJavaCode;

import java.util.List;
import java.util.stream.IntStream;

public class FpRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		List<String> words = List.of("Apple", "Ant", "Bat");

//		first problemm
		IntStream.range(1, 10).filter(e -> numbers.contains(e)).map(e -> e * e).forEach(e -> System.out.println(e));
// Second problem
		words.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
// third problem print length 	
		words.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

}
