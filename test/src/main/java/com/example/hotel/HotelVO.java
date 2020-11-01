package com.example.hotel;

//VO(Value Object)

public class HotelVO {

	private int seq;
	private String name;
	private int age;
	private String sex;
	private String email;
	
	private String searchCondition;
	
	private String searchKeyword;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
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

	// @JsonIgnore
	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

//	@JsonIgnore
	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public String toString() {
		return "HotelVO [seq=" + seq + ", name=" + name + ", age=" + age + ", sex=" + sex + ", email=" + email
				+ ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword + "]";
	}



	
}