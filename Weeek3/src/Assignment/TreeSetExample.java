package Assignment;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> names=new TreeSet<String>();
		names.add("Yeswanth");
		names.add("Naidu");
		names.add("Chandu");
		names.add("Naidu");
		names.add("Wailey");
		System.out.println(names);
		
		
		TreeSet<Book> set=new TreeSet<Book>(new Book(99, "leela", "prasanth", "cse", 7));
		System.out.println(set.add(new Book(101,"Let US C","Yeswanth","BPB",8)));
		System.out.println(set.add(new Book(102,"Data Communication","Naidu","MCS",6)));
		System.out.println(set.add(new Book(103,"Operatioin","Chandu","Wiley",5)));
		System.out.println(set.add(new Book(101,"Let US C","Yeswanth","BPB",8)));
		System.out.println(set.add(new Book(102,"Data Communication","Naidu","MCS",6)));
		System.out.println(set.add(new Book(103,"Operatioin","Chandu","Wiley",5)));
		

		
	}
}