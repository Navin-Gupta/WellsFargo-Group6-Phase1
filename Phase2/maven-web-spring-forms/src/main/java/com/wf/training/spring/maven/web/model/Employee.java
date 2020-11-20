package com.wf.training.spring.maven.web.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Employee {
	private String name;
	private String email;
	private String contact;
	private String country;
	private String dob;
	private String[] favoriteLanguages;
	
	
	
	
	
	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}



	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	private LinkedHashMap<String, String> countries;
	
	public Employee() {
		// interact with DB and initialize the list
		// dummy values
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR", "France");
		this.countries.put("IN", "India");
		this.countries.put("GR", "Germany");
		this.countries.put("US", "USA");
	}
	
	
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}





	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
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
