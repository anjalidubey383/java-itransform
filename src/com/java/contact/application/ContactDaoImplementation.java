package com.java.contact.application;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactDaoImplementation implements ContactDao {
	Contacts contacts = new Contacts();
	ArrayList<Contacts> arraylist = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<Contacts> addContact() {
		System.out.println("Enter the number of contacts you wants to add : ");
		int a = scanner.nextInt();
		System.out.println("Enter the details of contacts : ");

		for (int i = 0; i < a; i++) {
			System.out.println("Enter name of contact : ");
			String name = scanner.next();
			System.out.println("Enter number of contact : ");
			long number = scanner.nextLong();
			System.out.println("Enter email of contact : ");
			String email = scanner.next();

			arraylist.add(i, new Contacts(name, number, email));

		}
		System.out.println(arraylist);

		return arraylist;

	}

	@Override
	public List<Contacts> deleteContact() {

		System.out.println("Enter name to delete contact");

		String n = scanner.next();

		ListIterator<Contacts> listIterator = arraylist.listIterator();
		Contacts c = null;

		while (listIterator.hasNext()) {
			c = (Contacts) listIterator.next();

			String name = c.getName();

			if (name.equals(n)) {
				arraylist.remove(c);
				break;
			}
		}

		System.out.println(arraylist + "  " + arraylist.size());

		return arraylist;
	}

	@Override
	public List<Contacts> editContact() {
		{
			System.out.println("Enter name to update contact");

			String n = scanner.next();

			ListIterator<Contacts> listIterator = arraylist.listIterator();

			Contacts c = null;

			while (listIterator.hasNext()) {
				c = (Contacts) listIterator.next();

				String name = c.getName();

				if (name.equals(n)) {
					System.out.println("Enter Phone Number");
					long p = scanner.nextLong();

					c.setNumber(p);

				}
				System.out.println(c);
			}
			return arraylist;
		}
	}

	@Override
	public List<Contacts> searchByName() {
		System.out.println("Enter name to search contact");

		String n = scanner.next();

		ListIterator<Contacts> listIterator = arraylist.listIterator();

		while (listIterator.hasNext()) {
			Contacts c = (Contacts) listIterator.next();

			String name = c.getName();

			if (name.equals(n)) {
				System.out.println("The contact details is as follows :" + c);
			}
		}

		return arraylist;

	}

	@Override
	public List<Contacts> searchByNumber() {
		System.out.println("Enter number to search contact");

		long n = scanner.nextLong();

		ListIterator<Contacts> listIterator = arraylist.listIterator();

		while (listIterator.hasNext()) {
			Contacts c = (Contacts) listIterator.next();

			long num = c.getNumber();

			if (num == n) {
				System.out.println("The contact details is as follows :" + c);
			}
		}
		return arraylist;

	}

	@Override
	public List<Contacts> findAllContacts() {
		System.out.println("All Contacts are : ");
		System.out.println(arraylist);
		return arraylist;

		// TODO Auto-generated method stub

	}

}
