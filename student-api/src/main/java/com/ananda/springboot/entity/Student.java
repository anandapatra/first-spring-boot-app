package com.ananda.springboot.entity;

public class Student {
	
	private int id;
	private String name;
	private String streetAddress;
	private String phoneNumber;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String streetAddress, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.streetAddress = streetAddress;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
