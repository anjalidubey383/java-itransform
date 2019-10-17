package com.java.inheritance.and.polymorphism;

public class Book extends WrittenItem {

	public Book(int idNum, String title, int noOfCopies) {
		super(idNum, title, noOfCopies);
	}

	public void print() {
		System.out.println("The details of book are -");
		System.out.println("Title : " + getTitle() );
		System.out.println("Unique Identification Number : " + getIdNum());
		System.out.println("Number of copies : " + getNoOfCopies());
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}
}
