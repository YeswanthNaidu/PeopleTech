package com.peopletech.practice;


public class SortedOrder {
	
	public static void sortedArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] a={20,77,66,43,78};
		
		SortedOrder.sortedArray(a);
		
		

	}

}
