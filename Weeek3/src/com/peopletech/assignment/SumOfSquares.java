package com.peopletech.assignment;

import java.util.Scanner;

public class SumOfSquares {

	
	 public  int calculateDifference(int n) { 
		int sum=0,s1 = 0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			 s1=sum*sum;

		} 
		for(int i=1;i<=n;i++)
		{
			 sum=sum+(i*i);
	
		}
	
		int difference=s1-sum;
		

		return difference; 
	 }
	 
	 public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in); 
			SumOfSquares s1=new SumOfSquares();
			
			System.out.println("enter the number: "); 
			
			int n = scan.nextInt(); 
			System.out.println(s1.calculateDifference (n)); 
		}
}
