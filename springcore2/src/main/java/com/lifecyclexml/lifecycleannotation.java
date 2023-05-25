package com.lifecyclexml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class lifecycleannotation {

	private int cashback;

	public int getCashback() {
		return cashback;
	}

	public void setCashback(int cashback) {
		this.cashback = cashback;
	}

	public lifecycleannotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "lifecycleannotation [cashback=" + cashback + "]";
	}
	//to use this annotations we have put dependency and enable annotation <context:annotation-config/>
	@PostConstruct
	public void start() {
		System.out.println("starting cashback...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending cashback....");
	}
}
