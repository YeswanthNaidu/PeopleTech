package com.peopletech.lab2;

public class Cd extends MediaItem{
	
	String artist;
	String genre;
	
	public Cd(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runtime);
		// TODO Auto-generated constructor stub
		this.artist=artist;
		this.genre=genre;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	

}
