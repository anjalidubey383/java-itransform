package com.java.exception.assignment;

public class TaxCalculator {

	 double taxAmmount;
	
	public double calculateTax (String empName,boolean isIndian,double empSal){
		
		if (isIndian != true) {
			try {
			 throw new CountryNotValidException();
			}
			 catch(CountryNotValidException e) {
				 System.out.println("The employee should be an Indian citizen for calculating tax.");
			 }
		}
		
		if (empName == null || empName == "" )  {
			try {
			 throw new EmployeeNameInvalidException();
			}
			 catch(EmployeeNameInvalidException e) {
				 System.out.println("The employee name cannot be empty”.");
			 }
		}
		
		if (empSal>100000 && isIndian == true) {
			taxAmmount =  empSal * 0.08;
			System.out.println("tax Ammount is : " + taxAmmount);
		}
		else if (empSal>50000 && empSal < 100000 && isIndian == true) {
			taxAmmount =  empSal * 0.06;
			System.out.println("tax Ammount is : " + taxAmmount);
		}
		else if (empSal>30000 && empSal < 50000 && isIndian == true) {
			taxAmmount =  empSal * 0.05;
			System.out.println("tax Ammount is : " + taxAmmount);
		}
		else if (empSal>10000 && empSal < 30000 && isIndian == true) {
			taxAmmount =  empSal * 0.04;
			System.out.println("tax Ammount is : " + taxAmmount);
		}
		else if(empSal<10000) {
			try {
				 throw new TaxNotEligibleException();
				}
				 catch(TaxNotEligibleException e) {
					 System.out.println("The employee does not need to pay tax.");
				 }
			
		}
	return taxAmmount;
	}
}
