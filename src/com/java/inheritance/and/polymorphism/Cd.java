package com.java.inheritance.and.polymorphism;

public class Cd extends MediaItem {
	private String genre;
	private String artist;
	public Cd(int idNum, String title, int noOfCopies,String genre,String Artist ,int runtime) {
		super(idNum, title, noOfCopies, runtime);
		this.artist=Artist;
		this.genre=genre;
	}


	
	public void addItem() {

		
	}

	public void print() {
		System.out.println("The details of CD are -");
		System.out.println("Title : " + getTitle() );
		System.out.println("Unique Identification Number : " + getIdNum());
		System.out.println("Number of copies : " + getNoOfCopies());
		System.out.println("Artist : " + artist);
		System.out.println("Genre : " + genre);
		System.out.println("Runtime : " + getRuntime()+" sec");
		
	}
}
