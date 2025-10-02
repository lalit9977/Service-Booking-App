package com.serviceprovider;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookings") 
public class Booking {

	@Id
	private int number;
private   String name; 
private String address;
private  String servicename;

public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getServicename() {
	return servicename;
}


public void setServicename(String servicename) {
	this.servicename = servicename;
}


public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}

public String getName () {
	return name;
}
public void setName(String name) {
	this.name = name;
}



	
}
