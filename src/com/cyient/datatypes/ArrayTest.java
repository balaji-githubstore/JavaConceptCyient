package com.cyient.datatypes;

public class ArrayTest {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		
		//5 int ---> 10, 20, 30, 40, 50
		
		int[] numbers=new int[5]; //5*32 bits	
		numbers[0]=10;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
//		System.out.println(numbers[5]);
		
		numbers=new int[6];
		System.out.println(numbers);
		//6 in
		
		
		//create project,package,class as per the standard in eclipse and do below task
		//double array --> 10, 20.2, 56.5
		//String array --> colors ---> red,blue,green,yellow
		
		double[] darr=new double[3]; //3*64 bits
		System.out.println(darr[0]);
		
		String[] colors=new String[4]; 
		
		colors[0]="red"; //3*16 bits
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		//System.out.println(colors[5]);
		
		Object value=20.5;
		
		Object v="bala";
		
		
		Object[] objarr=new Object[3];
		
		objarr[0]=45;
		objarr[1]=45.2;
		objarr[2]="bala";
		
		
		int[][] numbs = {{45,65},{85,67},{45,87}};
		
		System.out.println(numbs[0][1]);
		
		int[][] nums2=new int[3][2];
		nums2[0][0]=45;
		nums2[0][1]=65;
		
		
	}

}



