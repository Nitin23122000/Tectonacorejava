package com.lifecyclexml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class initthroughInterfce implements InitializingBean,DisposableBean {
	
	private int rent;

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public initthroughInterfce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "initthroughInterfce [rent=" + rent + "]";
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("Init method called...");
	}

	public void destroy() throws Exception {

		System.out.println("destroy method called..");
	}
	

}
