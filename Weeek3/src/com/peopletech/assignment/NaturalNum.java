package com.peopletech.assignment;

import java.util.Scanner;

public class NaturalNum {
	
	private static int calculateSum(int n) { 
		int sum = 0; 
		int i = 1 ; 
		while (i<=n) { 
			if (i%3==0 || i%5==0) { 

				sum =sum+ i; 

			} 

			i++; 

		} 
		return sum; 
	} 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the number: "); 
		int n = sc.nextInt(); 
		System.out.println(calculateSum(n)); 

		
	}

}
