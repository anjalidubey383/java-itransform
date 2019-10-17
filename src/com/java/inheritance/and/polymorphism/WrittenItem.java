package com.java.inheritance.and.polymorphism;

public abstract class WrittenItem extends Items{
 private String author;
	public WrittenItem(int idNum, String title, int noOfCopies) {
		super(idNum, title, noOfCopies);
	
	}
	public abstract void addItem();
	
}
