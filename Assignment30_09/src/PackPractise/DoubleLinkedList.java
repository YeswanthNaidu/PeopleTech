package PackPractise;
public class DoubleLinkedList {

 


        Node head;
         

 

            
              public void add(int authorId ,String authorName,int noOfBooks ) {
              
              Node n =new Node(authorId, authorName, noOfBooks);
              n.next=head;
              n.prev=null; 
              if(head!=null) 
              { 
                  head.prev =n; 
                  } 
              head=n; 
                  }
             
        public void remove(int authorId) {
            Node curr=head;
            while(curr.next!=null) {
                if(curr.authorId==authorId)
                {
                    curr.next=curr.next;
                    curr=null;
                    break;
                }
            
            }
            curr=curr.next;
        }

 

        public void printList(Node n)
        {
             Node prev=null;
                while(n !=null)
                {
                    System.out.print(n.authorId+" "+n.authorName+" "+n.noOfBooks+" ");
                    
                    prev=n;
                    n=n.next;
                }
          
                }
        public static void main(String[] args) {
    
            DoubleLinkedList list= new DoubleLinkedList();
            
            list.add(101,"Yeswanth", 2);
            list.add(105,"Naidu", 7);
            list.add(110,"chandu", 5);
            list.add(108,"pandu", 9);
            
            list.printList(list.head);    
            
            list.remove(110);
            list.printList(list.head);    
            
        
}

 

 

class Node
{
    int authorId;
    String authorName;
    int noOfBooks;
    Node next;
    Node prev;
    public Node(int authorId, String authorName, int noOfBooks) {
        super();
        this.authorId = authorId;
        this.authorName = authorName;
        this.noOfBooks = noOfBooks;
        this.next = next;
        this.prev = prev;
    }
    
    
}
}