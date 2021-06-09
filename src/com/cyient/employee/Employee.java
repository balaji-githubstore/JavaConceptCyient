package com.cyient.employee;

public class Employee {
	public int empNo;
	public String empName;
	public double empSalary;
	protected static String companyName;
	
	public Employee()
	{
		
	}
	
	public Employee(int empNo)
	{	
		System.out.println(this);
		this.empNo=empNo;
	}
	
	public Employee(int empNo,String empName)
	{	
		
	}
	public Employee(double empNo)
	{	
		
	}
	
	public Employee(String empName,int empNo)
	{	
		
	}
	
	public static void printEmployeeDetails(Employee e)
	{
		System.out.println(e);
		System.out.println("-----------------------------------");
		System.out.println("Employee number: "+e.empNo);
		System.out.println("Employee name: "+e.empName);
		System.out.println("Employee Salary: "+e.empSalary);
		System.out.println("Company Name: "+Employee.companyName);
		System.out.println("-----------------------------------");
	}
	
	public void printEmployeeRecord()
	{
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
	}
	
	public static Employee createEmployeeObject()
	{
		Employee e=new Employee();
		return e;
	}	
	
	//getEmployeeDetailWithHighSalary(emp1,emp2)
}



