package com.CaseStudy;

/*
 * ====================================================================
 * This class contains the main function for the class EmployeeSalary
 * ====================================================================
 * 
 */

public class EmployeeSalaryTest {

	public static void main(String[] args) 
	{
		EmployeeSalary emp1= new EmployeeSalary();
		emp1.setEmployeeId(10001);
		emp1.setEmployeeName("SHANTI SAMANTA");
		emp1.setBasicSalary(30000);
		
		emp1.displaySalary();
	}

}
