package com.peopletech.lab5;

import com.peopletech.assignment.AgeException;
import com.peopletech.assignment.Banking;

public class Employee {
	
	
	public void fullName(String firstName,String lastName) throws FirstLastException {
		
		if(firstName==null && lastName==null)  {
			
			throw new FirstLastException(firstName,lastName);
			
		}
		else {
			System.out.println("print the full name  :"+ firstName+lastName);
		}
	}

	public static void main(String[] args) {
		
		
			Employee e=new Employee();
			try
			{
				e.fullName("yeswanth","naidu");
			}
			catch(FirstLastException e1)
			{
				System.out.println(e1);
			}
	}

}
