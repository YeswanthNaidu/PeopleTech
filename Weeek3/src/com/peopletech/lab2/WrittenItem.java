package com.peopletech.lab2;

import java.util.Objects;

public abstract class WrittenItem extends Item {
	
	
	private String author;


	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author = author;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		return Objects.equals(author, other.author);
	}


	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
	
	public void print()
	{
		System.out.println("print()");
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
