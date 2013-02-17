package it.manusaservices.model;

import java.util.ArrayList;



public class Customer {

	public String name, address;
	public ArrayList<Payment> availablePayments;
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Payment> getPayments() {
		return availablePayments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.availablePayments = payments;
	}

	

	public Customer() {

	}


}
