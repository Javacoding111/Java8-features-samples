package com.test;

public class EmployeeWithGender {
	
	private int id;
	private String name;
	private String gender;
	
	public EmployeeWithGender(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "EmployeeWithGender [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
