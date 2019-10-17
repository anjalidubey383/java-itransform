package com.java.interfacee.assignment;

public class LibraryInterfaceDemo {

	public static void main(String args[]) {
		
		 // creating an inatance of KidUser  
        // doing some operations 
		
		KidUser kiduser = new KidUser();
		System.out.println("Test case 1 : ");
		System.out.println("REGISTRATION : ");
		
		System.out.println("---------- Under 12 age registration : ----------");
		kiduser.registerAccount(10);
		
		System.out.println("---------- Above 12 age registration : ----------");
		kiduser.registerAccount(18);
		
		System.out.println("REQUESTING BOOK : ");
		
		System.out.println("---------- Under 12 and requesting book of kids category : ----------");
		kiduser.requestBook("kids");
		
		System.out.println("---------- Under 12 and requesting book of Fiction category : ----------");
		kiduser.requestBook("Fiction");
		
		
		AdultUser adultuser = new AdultUser();
		System.out.println("Test case 2 : ");
		System.out.println("REGISTRATION : ");
		
		System.out.println("---------- Above 12 age registration : ----------");
		adultuser.registerAccount(23);
		
		System.out.println("---------- below 12 age registration : ----------");
		adultuser.registerAccount(5);
		
		System.out.println("REQUESTING BOOK : ");
		
		System.out.println("---------- Above 12 and requesting book of kids category : ----------");
		adultuser.requestBook("Kids");
		
		System.out.println("---------- Above 12 and requesting book of Fiction category : ----------");
		adultuser.requestBook("Fiction");
		
	}
}
