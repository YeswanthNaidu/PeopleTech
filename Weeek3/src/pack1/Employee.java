package pack1;

public class Employee {
	int id;
	String name;
	int sal;
	Employee next;
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.next = null;
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
	public Employee getNext() {
		return next;
	}
	public void setNext(Employee next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "["+ id  + ", "+name + ","+ sal +  "]";
	}
	
	
	

}
