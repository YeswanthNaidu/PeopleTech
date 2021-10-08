package pack1;

public class DoublyLinkedList {
	
	
	ListNode head;
	ListNode tail;
	
	
	public void insert(int value)
	{
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			
			tail=newNode;
		}
		else
		{
			
			head.previous=newNode;
			
		}
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
			tail.next=newNode;
			newNode.previous=tail;
		}
		tail=newNode;
	}
	
	
	

	public ListNode removeFirst()
	{
		if(head==null)
		{
			System.out.println("the list is empty");
		}
		
		ListNode temp=head;
		 if(head==tail)
		{
			tail=null;
		}
		else {
			head.next.previous=null;
		}
		 head=head.next;
		 temp.next=null;
		 return temp;

			}
	
	
	public ListNode removeLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			
		}
		ListNode temp=tail;
		if(head==tail)
		{
			head=null;
		}
		else
		{
			tail.previous.next=null;
		}
		tail=tail.previous;
		tail.previous=null;
		return temp;
	}
	
	
	
	
	
	public void printForward()
	{
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	
	public void printBackward()
	{
		ListNode temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data +"---->");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		
		dll.insertLast(23);
		dll.insertLast(13);
		dll.insertLast(56);
		dll.insertLast(45);
		dll.insertLast(3);
		
		dll.printForward();
		//dll.printBackward();
		
		dll.removeFirst();
		dll.printForward();
		
		dll.removeLast();
		
		dll.printForward();
		
	}

}




class ListNode
{
	int data;
	ListNode previous;
	ListNode next;
	public ListNode(int data) {
		super();
		this.data = data;
		previous = null;
		this.next = null;
	}
	
	
}