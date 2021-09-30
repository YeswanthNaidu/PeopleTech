package com.peopletech.lab3;

import java.util.Scanner;

public class CountTheChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		char[] ch=new char[size];
		System.out.println("enter the elements in the array:");
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			char ch1=ch[i];
			if((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z')) {
			count=count+1;
			}
		}
		System.out.println(count);
		
		
	}
}
