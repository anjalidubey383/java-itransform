package com.java.inheritance.and.polymorphism;

public abstract class MediaItem extends Items {
	private int runtime;
	public abstract void addItem();
	

	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public MediaItem(int idNum, String title, int noOfCopies, int runtime) {
		super(idNum, title, noOfCopies);
		this.runtime=runtime;
	
	}

	
}
