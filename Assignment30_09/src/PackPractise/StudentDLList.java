package PackPractise;

public class StudentDLList {

	 

    Student head;
    static int size=0;
    // Adding Element to the End of the List
    public static void add(StudentDLList list , Student newStudent)
    {
        if(list.head==null)
            list.head=newStudent;
        else
        {
            Student curr=list.head;
            
            while(curr.next!=null)
                curr=curr.next;
            curr.next=newStudent;
            newStudent.prev=curr;
        }
        size++;
    }

	
	/*
	 * public static Student get(StudentDLList list,int index) { Student s=null;
	 * if(index>size) System.out.println("Invalid Index.."); else { int temp=1;
	 * s=list.head; while(s.next!=null) { s=s.next; temp++; if(temp==index) break; }
	 * 
	 * } return s; }
	 */
	   public static void printList(StudentDLList list)
    {
        Student curr=list.head;
        if(list.head==null)
            System.out.println("List is Empty...");
        else
        {
            while(curr!=null)
            {
                System.out.print(curr+" <-> ");
                curr=curr.next;
            }
            
        }
        System.out.println("\nList in reverse order\n");
        Student s=get(list,size);
        while(s!=null)
        {
            System.out.print(s+" <-> ");
            s=s.prev;
        }    
    }
    
    
    public static void addFirst(StudentDLList list, Student newStudent)
    {
        if(list.head==null)
            list.head=newStudent;
        else
        {
            newStudent.next=list.head;
            list.head.prev=newStudent;
            list.head=newStudent;
        }    
        size++;
    }
    
    
	
	/*
	 * public static void remove(StudentDLList list, Student s) {
	 * if(list.head==null) System.out.println("\nThe List is Empty"); else { Student
	 * curr=list.head; while(curr.next!=null) { if(curr.equals(s)) {
	 * curr.prev.next=curr.next; curr.next.prev=curr.prev; curr=null; break; }
	 * curr=curr.next; } } }
	 */
    
	
	  public static void addAfter(StudentDLList list,Student newStudent,Student after) {
		  
		  if(list.head==null)
		  {
			  System.out.println("the list is empty");
		  }
		  else
		  {
			  Student curr=list.head;
	            while(curr.next!=null)
	            {
	                if(curr.equals(after)) {
	                    curr.next=newStudent;
	                    newStudent.next=curr.next.next;
	                    newStudent.prev=curr;
	                    break;
	              
	                }
	                curr=curr.next;
	            }
	        }
	    }
		  
    public static void main(String[] args) {
        StudentDLList list=new StudentDLList();
        list.add(list, new Student(12,"Neelkanth","CS"));
        list.add(list, new Student(34,"Uttam","IT"));
        list.add(list, new Student(71,"Gargesh","EEE"));
        list.add(list,  new Student(66,"Yeswanth","ece"));
        list.add(list, new Student(62,"Tanisha","ECE")); 
        list.add(list, new    Student(86,"Kanak","CS"));
        
        printList(list);
        
		
		/*
		 * System.out.println("\nElement at index 2 : "+get(list,2));
		 * System.out.println("\n===============================================\n");
		 * list.addFirst(list, new Student(8,"Varsha","IIT")); printList(list);
		 * System.out.println("\n===============================================\n");
		 * list.remove(list, new Student(71,"Gargesh","EEE")); printList(list);
		 * System.out.println("\n===============================================\n");
		 */
        list.addAfter(list,new Student(66,"yeswanth","ece"),new Student(98,"Naidu","cse"));
        printList(list);
    }
	
 

}