package pack1;

public class Author {
	
	int id;
	String name;
	int noOfBooks;
	Author previous;
	Author next;
	
	public Author(int id, String name, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
		previous = null;
		next = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return   "[ " + id + ","+ name + "," + noOfBooks + "]";
	}
	
	
	
	
	

}
