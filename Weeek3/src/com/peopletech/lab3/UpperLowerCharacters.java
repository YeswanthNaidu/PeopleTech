package com.peopletech.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class UpperLowerCharacters {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		String[] str=new String[size];
		System.out.println("enter the names:");
		
		for(int i=0;i<=str.length-1;i++)
		{
			
			String ename=sc.next();
			str[i]=new String(ename);
			
			
		}
		Arrays.sort(str);
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.print("  " +str[i]);
		}
		System.out.println(" ");
		for(int i=0;i<=(str.length-1)/2;i++) {
			System.out.println(str[i].toUpperCase());

	}
		for(int i=(str.length)/2;i<=str.length-1;i++)
		{
			System.out.println(str[i].toLowerCase());
		}

}
}