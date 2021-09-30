package com.peopletech.lab3;

import java.util.Scanner;

public class SecondSmallest {
	
	
	
	public int getSecondSmallest(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
					
									}
		}
		return a[1];
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]= {10,30,20,50,40,33};
		SecondSmallest ss=new SecondSmallest();
		System.out.println(ss.getSecondSmallest(a));
		
		
		
		
	}

}
