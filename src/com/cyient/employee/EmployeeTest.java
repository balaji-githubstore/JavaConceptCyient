package com.cyient.employee;


public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee e=Employee.createEmployeeObject();
		
		Employee.printEmployeeDetails(e);
		
		Employee.printEmployeeDetails(Employee.createEmployeeObject());
		
		Employee.companyName="Cyient";
		Employee emp1=new Employee();
		
//		Employee emp1 = Employee.createEmployeeObject();
		emp1.empNo=101;
		emp1.empName="John";
		emp1.empSalary=5000;
		System.out.println(emp1);
		
		//Employee.printEmployeeDetails(emp1);
		emp1.printEmployeeRecord();
		
//		Employee emp2=new Employee();

		Employee emp2=Employee.createEmployeeObject();
		emp2.empNo=102;
		emp2.empName="Peter";
		emp2.empSalary=4000;
		System.out.println(emp2);
		
		//Employee.printEmployeeDetails(emp2);
		emp2.printEmployeeRecord();
		
	}

}
