package com.peopletech.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrder {
	
	public void getSorted(int[] a)
	{
		
		Arrays.sort(a);
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] a= new int[size];
		System.out.println("enter the elements one by one: ");
		for(int i=0;i<=size-1;i++)
		{
		 a[i]=sc.nextInt();
		}
		
		
		SortedOrder so=new SortedOrder();
		for(int i=0;i<=a.length-1;i++) {
		so.getSorted(a[i]);
		
	}


	}

	
}
