package com.cyient.logics;

public class DecisionMakingTest2 {

	public static void main(String[] args) {

		String browser = "CH";

		if (browser == "ch" || browser == "CH" || browser == "chrome") {
			System.out.println("logic for Launching Chrome!!");
		} else if (browser == "ff") {
			System.out.println("logic for Launching ff!!");
		} else if (browser == "edge") {
			System.out.println("logic for Launching edge!!");
		} else {
			System.out.println("logic for Launching ie!!");
		}

		switch (browser) {
		case "CH":
		case "ch":
		case "chrome":
			System.out.println("logic for Launching Chrome!!");
			break;
					
		case "ff":
			System.out.println("logic for Launching ff!!");
			break;
			
		case "ie":
			System.out.println("logic for Launching ie!!");
			break;
			
		default:
			System.out.println("logic for Launching ie!!");
			break;
		}
	
		int a=10;
		
//		switch (a) {
//		case 10:
//			System.out.println(a);
//			break;
//		case 20:
//			System.out.println(a);
//			break;
//		default:
//			break;
//		}

	}

}
