package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	int sal;

	
	public EmployeeException(int sal) {
		super();
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "EmployeeException [sal=" + sal + "]+ enter the salary above 3000";
	}

	
		
}
