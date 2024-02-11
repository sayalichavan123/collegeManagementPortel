package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.ContactRepository;
import com.mydata.model.Contact;

@Service
public class ContactServiceimpl implements ContactService {
	@Autowired
	ContactRepository contactRepository;

	@Override
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	public List<Contact> viewallcontact() {
		return contactRepository.findAll();
	}

	@Override
	public Contact getCOntactbyid(int id) {
		return contactRepository.findById(id).get();
	}

	@Override
	public void deletecontactbyid(int id) {
		contactRepository.deleteById(id);
	}

	@Override
	public Contact updateContact(Contact contact) {
		return contactRepository.save(contact);
	}

	

}
