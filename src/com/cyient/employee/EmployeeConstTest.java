package com.cyient.employee;


public class EmployeeConstTest {

	public static void main(String[] args) {
		
		Employee.companyName="Cyient";
		
		
		Employee emp1=new Employee();
		System.out.println(emp1);
		
		emp1.empNo=101;
		emp1.empName="John";
		emp1.empSalary=5000;
		
		
		Employee emp2=new Employee(102.2);
		
	}

}
