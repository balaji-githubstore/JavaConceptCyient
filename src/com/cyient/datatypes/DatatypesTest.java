package com.cyient.datatypes;

public class DatatypesTest {

	public static void main(String[] args) {

		byte a = 100; // a will be register for byte and then value 100 will stored //8 bits of memory
						// is utilities

		System.out.println(a);

//	    short c=10;

		int b = 100; // 32 bits

		System.out.println(b);

		// percentage --> 0 to 100 //45, 87, 90, 75
		// 1000 students
		// byte ---> 1000*8 = 8000 bits of memory used
		// int --->1000*32= 32000 bits of memory used

		b = a; // Implicit conversion --> no dataloss

		float f = 1.1f;
		System.out.println(f);

		double d = 1.1;
		System.out.println(d);

		d = f; // Implicit conversion --> no dataloss

//	    float x=1.12345789f;
//	    
//	    System.out.println(x);
//	    
		double y = 1.123456789;
		y = 45;

		System.out.println(y);

		float z = (float) y; // explicit conversion // lead to data loss

		System.out.println(z);

		char letter = '&';// 16 bit
		System.out.println(letter);

		boolean check = true; // 1bit

		String name = "balaji"; // 6*16 bits
		System.out.println(name);

		double numS = 457878787878787833333333333333.1;

		int c = (int) numS;

		System.out.println(c);

//	    String t="ooo";	    
//	    int zz=Integer.parseInt(t);
//	    System.out.println(zz);

		int bb = 'B';
		System.out.println(bb);

		Object zz = 45;// int
		Object zzz = numS; // double
		Object cc = "bbb";// String

		/*
		 * int vv=cc; System.out.println(vv);
		 */

		int finalPercentage = 45;

//	    ArrayTest tt = new ArrayTest();
//	    
//	    DatatypesTest ttt = (DatatypesTest) tt;

		String numbS = "88";

		int out = Integer.parseInt(numbS);
		System.out.println(out);

		double output = Double.parseDouble(numbS);
		System.out.println(output);
	}
}
