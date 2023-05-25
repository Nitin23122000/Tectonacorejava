package com.autowire;

public class Address {

	private String village;
	private String district;
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String village, String district) {
		super();
		this.village = village;
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", district=" + district + "]";
	}
	
}
