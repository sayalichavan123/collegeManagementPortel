package com.mydata.service;

import java.util.List;

import com.mydata.model.Contact;

public interface ContactService {
	
	Contact saveContact(Contact contact);
	
	List<Contact>viewallcontact();
	
	Contact getCOntactbyid(int id);
	
	void deletecontactbyid(int id);
	
	Contact updateContact(Contact contact);

}
