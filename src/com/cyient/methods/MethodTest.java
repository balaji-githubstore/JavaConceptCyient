package com.cyient.methods;

import com.cyient.area.Area;

public class MethodTest {

	public static void main(String[] args) {

		double result = Area.areaOfCircle(10);
		System.out.println(result);

		result = Area.areaOfCircle(20);
		System.out.println(result);

		// decalaration of local declaration
		int len = 10;
		int wid = 20;

		int res = Area.areaOfRectangle(len, wid);// calling static method
		System.out.println(res);

		Area obj= new Area();
		
		double output = obj.areaOfTriangle(wid, res);
		System.out.println(output);
		
		String name=Area.sendMyName();
		System.out.println(name);
		
		String role=obj.sendMyRole();
		System.out.println(role);
		
		obj.closeBrowser();
		
		Area.closeExcel();
		
//		obj.printName();
		
		

	}
}


