package com.test.address;

public class Person1 {

	private int personId;
	private String personName;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person1(int personId, String personName, Address address) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}
	
	
}
