package pack1;

public class AuthorDoublyLinkedList {
	
	Author head;Author tail;
	public void add(Author newNode)
	{
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
		}
		tail=newNode;
	}
	
	public void print()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Author temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp +"---->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	
	public void addFirst(Author newNode)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
	}

	
	public void addLast(Author newNode)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
	}
	
	
	public Author removeFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Author temp=head;
		head=head.next;
		temp.next=null;
		head.previous=null;
		return temp;
		
	}
	
	public Author removeLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Author temp=tail;
		tail=tail.previous;
		temp.previous=null;
		tail.next=null;
		return temp; 
	}
	

	
	public void insertAtMiddle(int position,Author newNode)
	{
		if(position==1)
		{
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
		else
		{
			int count=1;
			Author previous=head;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			Author current=previous.next;
			newNode.next=current;
			newNode.previous=previous;
			previous.next=newNode;
			current.previous=newNode;
			
			
		}
	}
	
	public void removeAtMiddle(int position,Author newNode)
	{
		
		Author temp=head;
		if(position==1)
		{
			head.next.previous=null;
			head=head.next;
			temp.next=null;
			}
		else
		{
			int count=1;
			Author previous=head;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			Author current=previous.next;
			previous.next=current.next;
			current.previous=previous.next;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AuthorDoublyLinkedList list=new AuthorDoublyLinkedList();
		
		list.add( new Author(23,"yeswanth",7));
		list.add( new Author(2,"naidu",9));
		list.add( new Author(56,"chandu",3));
		list.add( new Author(94,"pandu",8));
		list.add( new Author(64,"leela",2));
		
		list.print();
		
		list.addFirst(new Author(45,"prasanth",99));
		
		list.print();
		
		list.addLast( new Author(96,"nadipilli",90));
		
		list.print();
		
		
		list.removeFirst();
		
		list.print();
		
		list.removeLast();
		
		list.print();
		
		list.insertAtMiddle(3, new Author(100,"Santosh",999));
		
		list.print();
		list.removeAtMiddle(3, new Author(100,"Santosh",999));
		
		list.print();
		

	}

}
