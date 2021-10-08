package pack1;

public class LinkedList {
	Student head;
	
	
	public void add(LinkedList l,Student s)
	{
		if(head==null)
		{
			head=s;
			
		}
		else {
			Student current =head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=s;
		}
	}
	
	private void printList(LinkedList list) {
		// TODO Auto-generated method stub
		
		Student current =head;
		while(current!=null)
		{
			System.out.print(current  +"--->");
			current=current.next;
		}
		System.out.println("null");
		
	}
	
	
	public void get(LinkedList list, int index) {
		int i = 1;
		
			Student temp = head;
			while (temp != null) {
				if (i == index) {
					System.out.println(temp);
				}
				temp = temp.next;
				i++;
			}
	}

	
	public void getLast(LinkedList list) {
		
			Student temp = head;
			while (temp.next!= null) {
				temp = temp.next;
			}
			System.out.println(temp);
		}

	public void Lastindex(LinkedList l) {
		
		Student current=head;
		int i=0;
		while(current!=null)
		{
			current=current.next;
			i++;
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		list.add(list,new Student(45,"Yeswanth","cse"));
		list.add(list,new Student(90,"Naidy","ece"));
		list.add(list,new Student(58,"chandu","eee"));
		list.add(list,new Student(75,"leela","mech"));
		list.add(list,new Student(63,"pandu","cse"));
		
		list.printList(list);
		
		list.get(list,3);

		list.getLast(list);
		list.Lastindex(list);
	}


	
}
