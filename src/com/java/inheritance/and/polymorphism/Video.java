package com.java.inheritance.and.polymorphism;

public class Video extends MediaItem {

	private int yearOfRelease;
	private String director;
	private String genre;

	
	public Video(int idNum, String title, int noOfCopies, int yor,String Director,String Genre,int runtime) {
		super(idNum, title, noOfCopies,runtime);
		this.yearOfRelease=yor;
		this.director=Director;
		this.genre=Genre;
	
	}


	public void addItem() {

		
	}

	public void print() {
		
		System.out.println("The details of Video are -");
		System.out.println("Title : " + getTitle() );
		System.out.println("Unique Identification Number : " + getIdNum());
		System.out.println("Number of copies : " + getNoOfCopies());
		System.out.println("Year of Release : " + yearOfRelease);
		System.out.println("Director : " + director);
		System.out.println("Genre : " + genre);
		System.out.println("Runtime : " + getRuntime() + " sec");
	}
}
