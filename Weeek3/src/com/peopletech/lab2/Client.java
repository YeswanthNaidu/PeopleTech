package com.peopletech.lab2;

public class Client {

	public static void main(String[] args) {
		
	JournalPapers jp=new JournalPapers(101,"Catch Me When You Fall ",5,"Naidu",1992);
	jp.setIdentificationNumber(102);
	System.out.println("identificationNumber is:"+jp.getIdentificationNumber());

		
	jp.setTitle("They'll Never Catch Us ");
	System.out.println("Title is;"+jp.getTitle());
	
	jp.setNumberOfCopies(7);
	System.out.println("Number of copies are:"+jp.getNumberOfCopies());
	
	jp.setAuthor("Yeswanth");
	System.out.println("AuthorName :"+jp.getAuthor());
	
	jp.setPublishedYear(1995);
	System.out.println("published Year: "+jp.getPublishedYear());
	
		
	jp.setIdentificationNumber(103);
	System.out.println("identificationNumber is:"+jp.getIdentificationNumber());

		
	jp.setTitle("All the Bright Places  ");
	System.out.println("Title is;"+jp.getTitle());
	
	jp.setNumberOfCopies(9);
	System.out.println("Number of copies are:"+jp.getNumberOfCopies());
	
	jp.setAuthor("Chandu");
	System.out.println("AuthorName :"+jp.getAuthor());
	
	jp.setPublishedYear(1997);
	System.out.println("published Year: "+jp.getPublishedYear());
	
	jp.setIdentificationNumber(104);
	System.out.println("identificationNumber is:"+jp.getIdentificationNumber());

		
	jp.setTitle("They Wish They Were Us  ");
	System.out.println("Title is;"+jp.getTitle());
	
	jp.setNumberOfCopies(11);
	System.out.println("Number of copies are:"+jp.getNumberOfCopies());
	
	jp.setAuthor("Nadipili");
	System.out.println("AuthorName :"+jp.getAuthor());
	
	jp.setPublishedYear(2005);
	System.out.println("published Year: "+jp.getPublishedYear());
	System.out.println("**************************************************************************");
	
	Video mi=new Video(106,"Invisibly Breathing",23,1,"Rajamouli","fantasy",2021);
	mi.setIdentificationNumber(107);
	System.out.println(mi.getIdentificationNumber());
	
	mi.setTitle("A great book title is informative");
	System.out.println(mi.getTitle());
	
	mi.setNumberOfCopies(66);
	System.out.println(mi.getNumberOfCopies());
	
	mi.setRuntime(2);
	System.out.println(mi.getTitle());
	
	mi.setDirector("puri");
	System.out.println(mi.getDirector());
	
	mi.setGenre("fantasy");
	System.out.println(mi.getGenre());
	
	
	mi.setYearReleased(2000);
	System.out.println(mi.getYearReleased());
	
	System.out.println("****************************************************************************************");
	
	Cd c=new Cd(108,"Bahubali",33,7,"pradhas","fiction");
	
	
	c.setIdentificationNumber(108);
	System.out.println(c.getIdentificationNumber());
	
	c.setTitle("Bahubali");
	System.out.println(c.getTitle());
	
	c.setNumberOfCopies(88);
	System.out.println(c.getNumberOfCopies());
	
	c.setRuntime(5);
	System.out.println(c.getRuntime());
	
	c.setArtist("prabhas");
	System.out.println(c.getArtist());
	
	c.setGenre("fiction");
	System.out.println(c.getGenre());
	
	

	
	}

}
