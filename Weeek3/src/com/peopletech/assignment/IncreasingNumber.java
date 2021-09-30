package com.peopletech.assignment;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		int num;
		boolean number=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		IncreasingNumber in=new IncreasingNumber();
		System.out.println(in.checkNumber(num));
		
	}
	public  boolean checkNumber(int number)
	{
		boolean increasing = false;
        while(number>0) {
            int lastDigit = number % 10;
            number = number/10;
            int nextLastDigit = number % 10;
            
            if(nextLastDigit<=lastDigit) {
                increasing=true;
            }
            else {
                increasing=false;
                break;
            }
            
        }
        return increasing;
	}

}
