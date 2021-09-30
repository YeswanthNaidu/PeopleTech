package com.peopletech.assignment;

import java.util.Scanner;

public class PowerOfTwo {

	public boolean checkNumber(int n) {
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;

			}
			n=n/2;

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		PowerOfTwo p=new PowerOfTwo();
		System.out.println(p.checkNumber(num));



	}

}
