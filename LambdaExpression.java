package com.sise.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

	List<Score> scores;

	// public List<Score> filter(){
	// return scores.stream().filter(e->e.getScore()>=60);
	// }

	public static void main(String[] args) {
		// Runnable r1 = ()->{System.out.println("Hello lambda!");};
		// r1.run();

		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		a.add("g");
		a.add("h");
		a.add("i");
		a.add("j");
		a.forEach(o -> {
			System.out.println(o);
		});

		List<Score> scores = new ArrayList<Score>();
		scores.stream().filter(e -> e.getScore() >= 60)
				.collect(Collectors.toList());

		System.exit(0);
	}

}
