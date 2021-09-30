package com.peopletech.lab2;

import java.util.Objects;

abstract public class Item {
	
		private int identificationNumber;
		private String title;
		private int numberOfCopies;
		public Item(int identificationNumber, String title, int numberOfCopies) {
			super();
			this.identificationNumber = identificationNumber;
			this.title = title;
			this.numberOfCopies = numberOfCopies;
		}
		public  int getIdentificationNumber() {
			return identificationNumber;
		}
		public void setIdentificationNumber(int identificationNumber) {
			this.identificationNumber = identificationNumber;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getNumberOfCopies() {
			return numberOfCopies;
		}
		public void setNumberOfCopies(int numberOfCopies) {
			this.numberOfCopies = numberOfCopies;
		}




		@Override
		public String toString() {
			return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
					+ numberOfCopies + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(identificationNumber, numberOfCopies, title);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			return identificationNumber == other.identificationNumber && numberOfCopies == other.numberOfCopies
					&& Objects.equals(title, other.title);
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
		

