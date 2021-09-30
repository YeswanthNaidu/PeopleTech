package com.peopletech.lab5;

public class FirstLastException extends Exception{
	String FirstName;
	String LastName;
	
	
	
	public FirstLastException(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}



	@Override
	public String toString() {
		return "Dont Give Null values in the Srtring";
	}
	

}
