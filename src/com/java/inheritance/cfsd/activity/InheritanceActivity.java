package com.java.inheritance.cfsd.activity;

public class InheritanceActivity {

	public static void main(String args[]) {
		
		Manager managerinstance = new Manager(126534, "Peter", "Chennai, India",237844, 65000);
		managerinstance.calculateSalary();
		managerinstance.calculateTransportAllowance();
		
		Trainne trainneinstance = new Trainne(29846, "Jack", "Mumbai, India",442085, 45000);
		trainneinstance.calculateSalary();
		trainneinstance.calculateTransportAllowance();
		
		
	}
}
