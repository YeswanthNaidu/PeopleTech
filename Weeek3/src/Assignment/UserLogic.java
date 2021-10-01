package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee1,List<Project>> emp=new HashMap<Employee1,List<Project>>();
		
		Employee1 e1=new Employee1(111,"Yeswanth",100000);
		Employee1 e2=new Employee1(123,"Naidu",20000);
		Employee1 e3=new Employee1(99,"Chandu",450000);
		
		Project p1=new Project(234,"TCS",7);
		Project p2=new Project(567,"IBM",9);
		Project p3=new Project(345,"Peopletech",10);
		
		
		List<Project> emp1=new ArrayList<Project>();
		emp1.add(p1);
		emp1.add(p2);
		
		
		List<Project> emp2=new ArrayList<Project>();
		emp2.add(p2);
		emp2.add(p3);
		
		
		List<Project> emp3=new ArrayList<Project>();
		emp3.add(p1);
		emp3.add(p2);
		emp3.add(p3);
		
		emp.put(e1, emp1);
		emp.put(e2, emp3);
		emp.put(e3, emp2);
		
		
		System.out.println(emp);
		
		}

}
