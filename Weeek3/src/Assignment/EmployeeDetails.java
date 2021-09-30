package Assignment;

import java.util.Arrays;

public class EmployeeDetails  {

	public static void main(String[] args) {
		Employee emp[]=new Employee[5];
		emp[0]=new Employee(101,"yeswanth",22,30000);
		emp[1]=new Employee(105,"naidu",25,70000);
		emp[2]=new Employee(45,"chandu",24,43000);
		emp[3]=new Employee(99,"pandu",15,50000);
		emp[4]=new Employee(66,"leela",24,1000000);
		
		Arrays.sort(emp);
		
		for(Employee e:emp)
		{
			System.out.println(e);
			
		}
		
	}

}
