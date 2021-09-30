package com.peopletech.lab2;

import java.util.Objects;

public class JournalPapers extends WrittenItem {

	private int publishedYear;	
	
	

	public JournalPapers(int identificationNumber, String title, int numberOfCopies, String author, int publishedYear) {
		super(identificationNumber, title, numberOfCopies, author);
		this.publishedYear = publishedYear;
	}



	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}



	public int getPublishedYear() {
		return publishedYear;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(publishedYear);
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
		JournalPapers other = (JournalPapers) obj;
		return publishedYear == other.publishedYear;
	}



	@Override
	public String toString() {
		return "JournalPapers [publishedYear=" + publishedYear + "]";
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
	
	
	