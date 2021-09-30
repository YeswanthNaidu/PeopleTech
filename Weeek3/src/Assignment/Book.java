package Assignment;

import java.util.Comparator;

class Book implements Comparator<Book> {
	int id;
	String name, author, publisher;
	int quality;

	public Book(int id, String name, String author, String publisher, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quality = quality;

	}

	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}



	public String getPublisher() {
		return publisher;
	}



	public int getQuality() {
		return quality;
	}



	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quality="
				+ quality + "]";

	}

	
	public int compare(Book o1, Book o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}



	
}