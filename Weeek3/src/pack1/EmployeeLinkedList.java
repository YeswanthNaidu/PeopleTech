package pack1;

public class EmployeeLinkedList {
	
	Employee head;
	
	public void add(EmployeeLinkedList list,Employee emp)
	{
		if(head==null)
		{
			head=emp;
		}
		else {
			Employee current=head;
			
			while(current.next!=null)
			{
				current = current.next;
				
			}
			current.next=emp;
		}
	}
	
	
	public void insert(EmployeeLinkedList list)
	{
		
		Employee current=head;
		while(current!=null)
		{
			System.out.print(current +"--->");
			current=current.next;
			
		}
		System.out.println("null");
	}

	
	public Employee removeFirst()
	{
		
			Employee temp=head;
				head=head.next;
				temp.next=null;
			return temp;
		}
	
	
	public Employee removeLast()
	{
		Employee current=head;
		Employee previous=null;
		
		while(current.next!=null)
		{
			
			previous=current;
			current=current.next;
			
		}
		previous.next=null;
		return current;
	}
	
	public void addFirst(EmployeeLinkedList list,Employee newlist)
	{
		Employee cureent=head;
		newlist.next=head;
		head=newlist;
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeLinkedList list=new EmployeeLinkedList();
		list.add(list, new Employee(101,"yeswanth",1000000));
		list.add(list, new Employee(102,"naidu",9999999));
		list.add(list, new Employee(103,"chandu",1666660));
		list.add(list, new Employee(104,"nadipilli",9999900));
		list.add(list, new Employee(105,"leela",345670));

		list.insert(list);
		
		System.out.println(list.removeFirst());
		list.insert(list);
		
		System.out.println(list.removeLast());
		list.insert(list);
		
		list.addFirst(list,new Employee(106,"thomus",2345678));
		
		list.insert(list);

}
}
