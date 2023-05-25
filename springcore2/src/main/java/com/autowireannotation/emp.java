package com.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	@Autowired
	@Qualifier("address2")// it shows object me multiple bean me se konsi bean inject karni hai 
	// autowired k saath hi use hota hai
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
	
	

}
