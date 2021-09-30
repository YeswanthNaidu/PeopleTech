package Assignment;

public class Product {
	
	int price;
	String productName;
	int rating;
	
	
	
	public Product(int price, String productName, int rating) {
		super();
		this.price = price;
		this.productName = productName;
		this.rating = rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "\nProduct [price=" + price + ", productName=" + productName + ", rating=" + rating + "]";
	
	}
	
	

}
