package com.test.pincodes;

public class Address {

	private String dist;
	private String state;
	private int zipcode;
	public Address(String dist, String state, int zipcode) {
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
