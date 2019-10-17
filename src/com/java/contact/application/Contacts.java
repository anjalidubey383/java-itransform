package com.java.contact.application;

public class Contacts {

	private String name;
	private long number;
	private String email;

	public Contacts(String name, long number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public Contacts() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long p) {
		this.number = p;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", number=" + number + ", email=" + email + "]";
	}

}
