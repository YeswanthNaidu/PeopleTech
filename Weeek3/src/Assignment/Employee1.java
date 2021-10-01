package Assignment;

public class Employee1 {
	
	int id;
	String name;
	int sal;
	public Employee1(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
