package com.peopletech.lab3;

import java.util.Arrays;

public class SortedArray1 {



	public static void getSorted(int[] a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("***********************************");
		Arrays.sort(a);
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
			//int arr=a[i];
		}
		//return arr;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {18,74,23,56,45,35};


		SortedArray1.getSorted(a);





	}

}
