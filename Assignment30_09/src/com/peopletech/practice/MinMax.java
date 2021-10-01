package com.peopletech.practice;


public class MinMax {
	
	public void display(int a[])
	{
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
				
		}
		System.out.println("maximum value :"+max);
		System.out.println("minimum value :"+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {19,39,13,78,66,90,34,45,11,76};
		MinMax mm=new MinMax();
		mm.display(a);

	}

}
