package com.peopletech.lab5;

public class Person {
	
	public void display(int age) throws AgeException {
		if(age<15) {
			throw new AgeException( age);
			
		}
		else
		{
			System.out.println("you are enterted the valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		try {
			p.display(18);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		

	}

}
