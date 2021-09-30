package com.peopletech.assignment;

public class Banking {
	
	public void bankApp(int age,String name) throws AgeException {
		if(age<18)
		{
			throw new AgeException(age,name);
		}
		else
		{
			System.out.println("you are eligble for bank account");
		}
	}
	public static void main(String[] args) {
		Banking b=new Banking();
		try {
			b.bankApp(16,"Naidu");
		}
		catch(AgeException e) {
			System.out.println(e);
		}
		
	}

}
