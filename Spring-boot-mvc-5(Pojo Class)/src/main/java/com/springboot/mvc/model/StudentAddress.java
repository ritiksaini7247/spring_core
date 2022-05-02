package com.springboot.mvc.model;

public class StudentAddress {

	private String country;
	private String state;
	private String city;

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAddress(String country, String state, String city) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentAddress [country=" + country + ", state=" + state + ", city=" + city + "]";
	}

}
