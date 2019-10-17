package com.java.inheritance.cfsd.activity;
public class Trainne extends Employee{

	Trainne(long Id , String Name , String Address , long Phone , double Salary){
		super (Id ,Name,Address,Phone);
		this.basicSalary=Salary;
	
	}
	
}
