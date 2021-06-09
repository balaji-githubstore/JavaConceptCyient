package com.cyient.stringmethods;

public class StringMethodsTest {
	
	public static void main(String[] args) {
		
		
		String name="bala"; //new String("hello")
		
		name = name.toUpperCase();
		
		
		System.out.println(name);
		
		System.out.println(name.equals("BALA"));
		
		if(name.equalsIgnoreCase("bala"))
		{
			System.out.println("pass");
		}
		
		if(name.contains("BA"))
		{
			System.out.println("yes");
		}
	}

}
