package com.removexml;

public class cricket {
	
	private stadium st;

	public cricket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public stadium getSt() {
		return st;
	}

	public void setSt(stadium st) {
		this.st = st;
	}

	public cricket(stadium st) {
		super();
		this.st = st;
	}

	@Override
	public String toString() {
		
		return "cricket [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void ok() {
		this.st.display();
	}

}
