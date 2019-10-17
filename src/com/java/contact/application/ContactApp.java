package com.java.contact.application;
import java.util.Scanner;

public class ContactApp extends Contacts {

	public ContactApp(String name, long number, String email) {
		super(name, number, email);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		System.out.println("Listing all Contact opertions : ");
		// findAllContacts();
		ContactDaoImplementation contact = new ContactDaoImplementation();
		Scanner scanner = new Scanner(System.in);
	

		boolean value =true;

		while (value) {
			System.out.println("Enter 1 to Add Contact\n" 
					+ "Enter 2 to search contact by name\n"
					+ "Enter 3 to find contact by phone number\n"
					+ "Enter 4 to Edit contact\n"
					+ "Enter 5 to Delete contact\n"
					+ "Enter 6 to find all Contacts");

			int n = scanner.nextInt();

			switch (n) {
			case 1:
				contact.addContact();
				break;
			case 2:
				contact.searchByName();
				break;
			case 3:
				contact.searchByNumber();
				break;
			case 4:
				contact.editContact();

				break;
			case 5:
				contact.deleteContact();
				break;
			case 6:
				contact.findAllContacts();
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Enter true to continue");
			value = scanner.nextBoolean();

		}
	}
}
