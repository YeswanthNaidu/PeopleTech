package com.peopletech.lab5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print("  "+i);
			count=0;
			
		}
		

	}

}