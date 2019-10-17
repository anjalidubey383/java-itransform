package com.java.inheritance.and.polymorphism;

public class JournalPaper extends WrittenItem {

	
	private int yearpublished; 
	
	public JournalPaper(int idNum, String title, int noOfCopies, int yearpublished) {
		super(idNum, title, noOfCopies);
	this.yearpublished=yearpublished;
	}


	public void addItem() {
	
		
	}

	
	public void print() {
		System.out.println("The details of JournalPaper are -");
		System.out.println("Title : " + getTitle() );
		System.out.println("Unique Identification Number : " + getIdNum());
		System.out.println("Number of copies : " + getNoOfCopies());
		System.out.println("Year of Published : " + yearpublished);
	}

	
}
