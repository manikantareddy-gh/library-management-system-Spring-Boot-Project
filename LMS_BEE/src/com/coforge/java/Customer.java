package com.coforge.java;

public class Customer extends Person {
	int allocated_bid = -1;

	public Customer(int id, String name, int allocated_bid) {
		super(id, name);
		this.allocated_bid = allocated_bid;

	}

	@Override
	public void display() {
		System.out.println("This is Customer class");
	}

}
