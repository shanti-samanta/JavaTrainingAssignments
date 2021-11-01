package com.CaseStudy;

public class EmployeeSalary 
{
	private String employeeName;
	private int employeeId;
	private double basicSalary, specialAllowance, hra, transportAllowance;
	final private double tax=2500;
	
	private double netSalary=0.0, grossSalary=0.0;
	
	//GETER-SETTER for employeeName
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	//GETER-SETTER for employeeId
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}
	
	
	//GETER-SETTER for basicSalary
	public double getBasicSalary() 
	{
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	private double calculateNetSalary()
	{
		if(basicSalary <= 10000)
		{
			hra= 0.2 * basicSalary;
			specialAllowance= 0.8 * basicSalary;
			transportAllowance= 0.2 * basicSalary; 
			grossSalary= basicSalary + hra + specialAllowance + transportAllowance;
		}
		
		else if(basicSalary <= 20000 && basicSalary > 10000)
		{
			hra= 0.25 * basicSalary;
			specialAllowance= 0.9 * basicSalary;
			transportAllowance = 0.2 * basicSalary; 
			grossSalary= basicSalary + hra + specialAllowance + transportAllowance;
		}
		
		else if(basicSalary > 20000)
		{
			hra= 0.2 * basicSalary;
			specialAllowance= 0.8 * basicSalary;
			transportAllowance= 0.2 * basicSalary; 
			grossSalary= basicSalary + hra + specialAllowance + transportAllowance;
		}
		
		netSalary= grossSalary - tax;
		return netSalary;
	}
	
	
	public void displaySalary()
	{
		System.out.println("\n==============================================");
		System.out.println("\t\t SALARY DETAILS ");
		System.out.println("==============================================");
		System.out.println("ID: "+ employeeId +" \t   | NAME: "+ employeeName+" \n");
		
		calculateNetSalary();
		
		System.out.println("BASIC SALARY       : "+ basicSalary);
		System.out.println("SPECIAL ALLOWANCE  : "+ specialAllowance);
		System.out.println("HRA                : "+ hra);
		System.out.println("TRANSPORT ALLOWANCE: "+ transportAllowance);
		System.out.println("TAX                : "+ tax);
		System.out.println("----------------------------------------------");
		System.out.println("NET SALARY         : "+ netSalary);
	}
}
