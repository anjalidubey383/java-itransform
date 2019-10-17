package com.java.inheritance.and.polymorphism;

public class ClientProgram {
	
	public static void main(String args[]) {
		
		Book bookinstance = new Book(101, "Learn Java", 30);
		bookinstance.print();
		System.out.println("");
		JournalPaper jpinstance = new JournalPaper (202,"Research on Operators", 21 , 2018);
		jpinstance.print();
		System.out.println("");
		Video videoinstance = new Video (303,"Dance Video",44,2019,"Jack","Action", 50);
		videoinstance.print();
		System.out.println("");
		Cd cdinstance = new Cd (402,"Information",443,"Learning","Tom",80);
		cdinstance.print();
		
	}

}
