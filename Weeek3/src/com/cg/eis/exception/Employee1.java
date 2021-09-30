package com.cg.eis.exception;

public class Employee1 {
	
	public void display(int sal) throws EmployeeException
	{
		if(sal<3000) 
		throw new EmployeeException( sal);
		else
			System.out.println("you have enterted an Valid salary");
	}

	public static void main(String[] args) {

			
			Employee1 emp=new Employee1();
			try {
				emp.display(5000);
			}
			catch(EmployeeException e) {
				System.out.println(e);
			}
	}

}
