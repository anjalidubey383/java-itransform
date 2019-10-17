package com.java.exception.assignment;

public class CalculatorSimulato {

	public static void main (String args []) {
		TaxCalculator taxcal = new TaxCalculator();
		
		taxcal.calculateTax("Ron",false,34000);
		taxcal.calculateTax("tim",true,1000);
		taxcal.calculateTax("Jack",true,55000);
		taxcal.calculateTax("",true,30000);
		
	}
	
}
