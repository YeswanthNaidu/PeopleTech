package Assignment;

import java.util.Scanner;
import java.util.TreeSet;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Product> prods=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how would to like to sort product list");
		String sort=sc.next();
		
		if(sort.equalsIgnoreCase("price"))
			prods=new TreeSet<Product>(new ProductByPrice());
		else if(sort.equalsIgnoreCase("rating"))
			prods=new TreeSet<Product>(new ProductByRating());
		else if(sort.equalsIgnoreCase("name"))
			prods=new TreeSet<Product>();
		
		prods.add(new Product(20000,"Keyboard",5));
		prods.add(new Product(10000,"LED",5));
		prods.add(new Product(30000,"Screeen",5));
		prods.add(new Product(5000,"Speakers",5));
		prods.add(new Product(200,"Amazone Stick",5));
		
		System.out.println(prods);
		

	}

}
