package org.write;

import java.util.ArrayList;

public class Root {

	private String name;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public Address getAddress() {
		return Address;
	}



	public void setAddress(Address address) {
		Address = address;
	}



	public ArrayList<String> getCourses() {
		return courses;
	}



	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}



	private int age;
	
	
	private boolean status;
	
	
	
	private Address Address;
	
	
	
	private ArrayList<String> courses;
	
	
}
