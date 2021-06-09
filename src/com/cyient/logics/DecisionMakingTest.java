package com.cyient.logics;

public class DecisionMakingTest {

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser == "ch" || browser == "CH" || browser == "chrome") {
			System.out.println("logic for Launching Chrome!!");
		} else if (browser == "ff") {
			System.out.println("logic for Launching ff!!");
		} else if (browser == "edge") {
			System.out.println("logic for Launching edge!!");
		} else {
			System.out.println("logic for Launching ie!!");
		}

		int num = 85;

		if (num >= 80 && num <= 89) {
			System.out.println("between 100 and 200!!");
		}

		int mark = 100;

	}

}
