package com.coforge.java;

public class Person {

	protected int id;
	protected String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("This is Person class");
	}
}
