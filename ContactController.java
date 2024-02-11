package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.Contact;
import com.mydata.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;

	@GetMapping("/savecontact")
	private String showcontactControllerform(Model model) {
		Contact c = new Contact();
		model.addAttribute("savecontacts", c);
		return "Addcontact.html";

	}

	@PostMapping("/savecontact")
	public String addcontact(@ModelAttribute("savecontacts") Contact contact) {
		contactService.saveContact(contact);
		return "Addcontact.html";

	}

	@GetMapping("/viewallcontact")
	public String viewallContact(Model model) {
		List<Contact> clist = contactService.viewallcontact();
		model.addAttribute("allcontact", clist);
		return "contacts.html";

	}

	@GetMapping("/contact/{id}")
	public String deletestudentbyid(@PathVariable int id) {
		contactService.deletecontactbyid(id);
		return "redirect:/viewallcontact";
	}

	@GetMapping("/contact/edit/{id}")
	public String showupdateContactForm(@PathVariable int id, Model model) {

		Contact getconctbyid = contactService.getCOntactbyid(id);
		model.addAttribute("updatecontact", getconctbyid);
		return "updatecontact.html";
	}

	@PostMapping("/contact/edit/{id}")
	public String updateContact(@PathVariable int id, @ModelAttribute("updatecontact") Contact contact, Model model) {

	    Contact existingContact = contactService.getCOntactbyid(id);
	    existingContact.setName(contact.getName());
	    existingContact.setPosition(contact.getPosition());
	    existingContact.setMobno(contact.getMobno());
	    existingContact.setEmail(contact.getEmail());
	    existingContact.setDepartment(contact.getDepartment());

	    contactService.updateContact(existingContact);

	    return "redirect:/viewallcontact";
	}
}