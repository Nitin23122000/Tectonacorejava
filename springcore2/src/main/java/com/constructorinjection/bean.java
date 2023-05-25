package com.constructorinjection;

public class bean {
	private int id;
	private String name;
	public bean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "bean [id=" + id + ", name=" + name + "]";
	}
	

}
