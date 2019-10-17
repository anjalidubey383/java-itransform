package com.java.contact.application;
import java.util.List;



public interface ContactDao {

	List<Contacts> addContact();
	List<Contacts> deleteContact();
	List<Contacts> editContact();
	List<Contacts> searchByName();

	List<Contacts> searchByNumber();
	List<Contacts> findAllContacts();
		
	
}
