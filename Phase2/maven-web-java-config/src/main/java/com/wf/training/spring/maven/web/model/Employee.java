package com.wf.training.spring.maven.web.model;

public class Employee {
	private String name;
	private String email;
	private String contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		if(this.contact == null)
			this.contact = "222222";
		return contact;
	}
	public void setContact(String contact) {
		if(contact.contentEquals(""))
			this.contact = "333333";
		else
			this.contact = contact;
	}
	
}
