package com.cyient.logics;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

		int p=10;

//		System.out.println("enter percentage\n");
//		Scanner sc = new Scanner(System.in);
//		p = sc.nextInt();

		if (p >= 90)
			System.out.println("Grade A");
		else if (p <= 80 && p >= 89)
			System.out.println("Grade B");
		else if (p >= 33 && p <= 59)
			System.out.println("Grade C");
		else if (p < 33)
			System.out.println("Grade F");

	}

}
