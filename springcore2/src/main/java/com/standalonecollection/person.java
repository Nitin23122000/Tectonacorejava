package com.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.convert.Property;

public class person {

	private List<String> friends;
	private Map<String, Integer> fees;
	private Properties properties;
	


	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", fees=" + fees + "]";
	}
	
}