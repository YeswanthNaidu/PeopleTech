package Assignment;

import java.util.Scanner;
import java.util.TreeSet;

public class MovieList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Movie> mov=null;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how would you like to sort the movie");
		String sort=sc.next();
		
		
	
		
		if(sort.equalsIgnoreCase("id"))
			mov=new TreeSet<Movie>(new MovieById());
			
			else if(sort.equalsIgnoreCase("price"))
				mov=new TreeSet<Movie>(new MovieByPrice());
			else if(sort.equalsIgnoreCase("title"))
				mov=new TreeSet<Movie>(new MovieByTitle());
		
		mov.add(new Movie(101,"bahubali",3,100));
		mov.add(new Movie(99,"bahu",5,150));
		mov.add(new Movie(197,"mirchu",1,50));
		mov.add(new Movie(17,"rock",2,10));
		
		
		
	
		System.out.println(mov);
	}

}
