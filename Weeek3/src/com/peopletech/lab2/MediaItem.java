package com.peopletech.lab2;

import java.util.Objects;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
		super(identificationNumber, title, numberOfCopies);
		this.runtime=runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(runtime);
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
		MediaItem other = (MediaItem) obj;
		return runtime == other.runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
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
