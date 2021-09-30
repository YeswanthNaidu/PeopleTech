package com.peopletech.assignment;

public class AgeException extends Exception {
	int age;
	String name;
	public AgeException(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "AgeException [age=" + age + ", name=" + name + "]";
	}
	
	

}
