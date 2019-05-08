package io.javabrains.springbootstarter;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class Hello {
	
	private String manufacturer;
	private String name;
	
	public Hello() {
		
	}
	
	
	public Hello(String manufacturer, String name) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public ResponseEntity<String> exchange(String createURLWithPort, HttpMethod post, HttpEntity<String> entity,
			Class<String> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
