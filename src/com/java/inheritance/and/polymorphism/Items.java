package com.java.inheritance.and.polymorphism;

public abstract class Items {
	private int idNum;
	private String title;
	private int noOfCopies;
	
	public abstract void print();
	

	
	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (idNum != other.idNum)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	public String toString() {
		return "Items [idNum=" + idNum + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}

	public Items(int idNum, String title, int noOfCopies) {
		this.idNum = idNum;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

}
