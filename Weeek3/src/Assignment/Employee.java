package Assignment;

import java.util.Comparator;

public   class Employee implements Comparable<Employee>,Comparator<Employee>

{
	private int id;
	private String name;
	private int age;
	private int salary;

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name; 
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
