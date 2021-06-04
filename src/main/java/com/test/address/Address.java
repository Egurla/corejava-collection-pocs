package com.test.address;

public class Address {

	private String dist;
	public Address(String dist, String state, String zipcode) {
		super();
		this.dist = dist;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	private String state;
	private String zipcode;
	
}
