package com.cyient.variable;

public class VariableTest {
	public static int aS=10; //static variable or class variable
	public static int bS=20;
	public int aNS=10; //non-static variable or instance variable
	public int bNS=20;
	
	public static void main(String[] args) {
		
		VariableTest.aS=500;
		System.out.println(VariableTest.aS);
		System.out.println(VariableTest.bS);
		
		VariableTest obj1=new VariableTest();
		VariableTest obj2=new VariableTest();
		VariableTest obj3=new VariableTest();
		
		obj2.aNS=45;
		
//		-----------
		obj3=obj1=obj2; //asking obj2 to point to the address of obj1

		System.out.println(obj1);//L1
		System.out.println(obj1.aNS);//10
		System.out.println(obj1.bNS);//20
		
		System.out.println(obj2);//L1
		System.out.println(obj2.aNS);//10
		System.out.println(obj2.bNS);//20
		
		System.out.println(obj3);//L3
		System.out.println(obj3.aNS);//10
		System.out.println(obj3.bNS);//20
		
		

	}

}
