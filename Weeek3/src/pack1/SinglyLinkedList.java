package pack1;

public class SinglyLinkedList {
	
	ListNode head;
	
	
	private static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data)
		{
			this.data=data;
			this.next=next;
		}
		
	}
	
	
	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data +"---->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		
		int count=0;
		 ListNode current=head;
		 while(current!=null)
		 {
			 count++;
			 current=current.next;
		 }
		 return count;
	}
	
	
	public void insert(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int value)
	{
		ListNode newNode=new ListNode(value);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			ListNode current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
		
	}
	
	public void insertAtMiddle(int position,int value)
	{
		ListNode node=new ListNode(value);
		
		if(position==1)
		{
			node.next=head;
			head=node;
		}
		else
		{
			int count=1;
			ListNode previous=head;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			node.next=current;
			previous.next=node;
		}
			
	}
	
	public ListNode removeFirst()
	{
		if(head==null)
			
		{
			return null;
		}
		else
		{
			ListNode temp=head;
			
				head=head.next;
				temp.next=null;
				return temp;
		}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sll=new SinglyLinkedList();
	//	sll.head=new ListNode(8);
		
	//	ListNode second=new ListNode(7);
		
	//	ListNode third=new ListNode(17);
		
	//	ListNode fourth=new ListNode(19);
		
	//	sll.head.next=second;
	//	second.next=third;
	//	third.next=fourth;
	//	sll.display();
	//	System.out.println("length is " +sll.length());
		
		sll.insert(87);
		
		sll.insert(98);
		
		sll.insert(90);
				
	sll.insertLast(89);
		sll.insertLast(78);
	sll.insertLast(77);
		sll.insertAtMiddle(1,5 );
		sll.insertAtMiddle(2, 6);
		sll.insertAtMiddle(1,9);
		sll.insertAtMiddle(2,77);
		sll.insertAtMiddle(3, 30);
		
		sll.display();
		
		sll.removeFirst();
		sll.display();
		
		

	}

}
