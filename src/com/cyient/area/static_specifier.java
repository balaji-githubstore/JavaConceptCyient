package com.cyient.area;

class access {
	public int x;
	public static int y;

	void cal(int a, int b) {
		x = x + a;
		y = y + b;
	}
}

public class static_specifier {
	public static void main(String args[]) {
		access obj1 = new access();
		access obj2 = new access();
		obj1.x = 0;
		obj1.y = 0;
		obj1.cal(1, 5);
		obj2.x = 0;
		obj2.cal(2, 3);
		System.out.println(obj1.x + " " + obj2.y);
	}
}