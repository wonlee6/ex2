package com.example.hotel.dao;

public class Ajax {

	private String name;
	private int age;
	private String sex;
	private String email;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Ajax [name=" + name + ", age=" + age + ", sex=" + sex + ", email=" + email + "]";
	}
	
	
}
