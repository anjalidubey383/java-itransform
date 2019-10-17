package com.java.inheritance.cfsd.activity;

public class Employee {
	 
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	Employee(){
		
	}
	Employee(long Id , String Name , String Address , long Phone ){
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
	}
	public void calculateSalary(){
		double salary;
		
		 salary = basicSalary + (basicSalary * (specialAllowance/100)) + (basicSalary * (Hra/100));
	System.out.println("Salary for " + employeeName + " is : " + salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (0.10)*basicSalary;
		System.out.println("The default transport allowance of an employee is : " + transportAllowance);
	}
	
}


