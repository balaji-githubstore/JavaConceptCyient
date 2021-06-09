package com.cyient.datatypes;

public class StringTest {

	public static void main(String[] args) {

		String name1="    bala dina      ";
		
		System.out.println(name1);
		
		name1=name1.trim();
		
		System.out.println(name1);
		
		
		System.out.println("---------------------------------------------------------");
		String name2="bala";
		
		String name3=new String("bala");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		
		System.out.println(name1==name2);
		
		System.out.println(name1==name3); //compares the location and then check for text
		
		System.out.println(name1.equals(name3)); //compare only text
		
		System.out.println(name1.contains("ba"));
		
		System.out.println("---------------------------------------------------------");
		
		String actualAlertText="New Due Clinical Reminders\r\n"
				+ "\r\n"
				+ "Assessment: Tobacco\r\n"
				+ "\r\n"
				+ "(See the Clinical Reminders widget for more details)";
		
		System.out.println(actualAlertText);
		
		System.out.println(actualAlertText.equals("New Due Clinical Reminders")); //false
		
		System.out.println(actualAlertText.contains("New Due Clinical Reminders")); //true
		
		
		if(actualAlertText.contains("New Due Clinical Reminders"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
