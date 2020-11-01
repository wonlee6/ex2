package com.example.hotel.dao;

public class AdminPage {

	private String ksum;
	private int sum;
	public String getKsum() {
		return ksum;
	}
	public void setKsum(String ksum) {
		this.ksum = ksum;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public AdminPage(String ksum, int sum) {
		super();
		this.ksum = ksum;
		this.sum = sum;
	}

	
	
}
