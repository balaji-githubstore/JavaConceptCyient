package com.cyient.area;

public class Area {

	// declaration and definition of static method
	public static double areaOfCircle(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}

	public static int areaOfRectangle(int length, int width) {
		return length * width;
	}

	// areaOfSquare
	public static int areaOfSquare(int side) {
		return side * side;
	}

	// areaoftrapezium
	public static double areaOfTrapezium(int base1, int base2, int height) {
		double area = ((base1 + base2) * height) / 2.0;
		return area;
	}

	// areaOfTriangle
	//non static method
	public double areaOfTriangle(int base, int height) 
	{
		double area = (base * height) / 2.0;
		return area;
	}
	
	public static String sendMyName()
	{
		return "balaji";
	}
	
	//non static method
	public String sendMyRole()
	{
		String role="Corporate Trainer";
		return role;
	}
	
	public void closeBrowser()
	{
		
	}
	
	public static void closeExcel()
	{
		
	}
	
	public void printName(String name)
	{
		System.out.println("balaji");
	}

}





