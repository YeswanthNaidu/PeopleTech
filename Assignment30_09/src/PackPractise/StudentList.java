package PackPractise;

public class StudentList {
	Student head;
	public static void add(StudentList list, Student newStudent) {
		if(list.head==null)
			list.head=newStudent;
		//System.out.println("List is empty");
		else {
			Student trav = list.head;
			while(trav.next!=null)
				trav = trav.next;
			trav.next = newStudent;
		} }
	public static void addFirst(StudentList list, Student newStudent) {
		if(list.head==null)
			list.head = newStudent;
		else {
			newStudent.next=list.head;
			list.head=newStudent;
		}
	}
	public static void printList(StudentList list) {
		Student trav;
		if(list.head==null)
			System.out.println("Empty List");
		else {
			trav = list.head;
			while(trav!=null) {
				System.out.println(trav+"-->");
				trav = trav.next;
			}
		}
	}
	public static void remove(StudentList list, Student s) {
		if(list.head==null)
			System.out.println("Empty List");
		else if(list.head.getRollno()==s.getRollno()) {
			Student temp =list.head;
			list.head=list.head.next;
			temp= null;
		}
		else {
			Student curr = list.head;
			Student curr1 = null;
			while(curr1.next!=null) {
				if(curr.getRollno()==s.getRollno()) {
					curr.next=curr1.next;
					curr1=null;
					break;
				}
				curr = curr1;
				curr1= curr1.next;
			}
		}
	}
	public static void main(String[] args) {
		StudentList list = new StudentList();
		list.add(list, new Student(12,"Sandhya","cse"));
		list.add(list, new Student(16,"Ramani","ee"));
		list.add(list, new Student(15,"Vania","ece"));
		list.add(list, new Student(13,"lucky","ce"));
		printList(list); }
}

