package Assignment;

import java.util.Comparator;

public class MovieByTitle implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		String s1=o1.getTitle();
		String s2=o2.getTitle();
		return s1.compareTo(s2);
	}

}
