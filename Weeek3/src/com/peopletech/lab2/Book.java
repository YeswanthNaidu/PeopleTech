package com.peopletech.lab2;

public class Book extends WrittenItem {

	
	
	public Book(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}
	public void checkIn() {
		System.out.println("checkIn");
	}
	public void checkOut() {
		System.out.println("checkOut");
	}
	
	public void addItem() {
		System.out.println("add Item");
	}
	

}
