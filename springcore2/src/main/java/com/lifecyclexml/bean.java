package com.lifecyclexml;

public class bean {

	private double price;

	public double getPrice() {
		System.out.println("setting price ....");
		return price;
	}

	public void setPrice(double price) {
		
		this.price = price;
	}

	public bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public bean(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "bean [price=" + price + "]";
	}
	
	public void welcome() {
		System.out.println("Init method called");
			System.out.println(" welcome to my work");
	}
	
	public void getout() {
		System.out.println("destroy method called");
			System.out.println(" Good bye from my work");
	}
	
}
