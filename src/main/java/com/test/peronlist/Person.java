package com.test.peronlist;

import com.test.pincodes.Address;

public class Person {
	private int personId;
	private String personName;
	private String personEmail;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public Person(int personId, String personName, String personEmail) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personEmail = personEmail;
	}

	
}
