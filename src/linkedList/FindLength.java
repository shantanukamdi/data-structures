package linkedList;

public class FindLength {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(15);
		list.insert(5);
		list.insert(1);
		list.insert(0);
		
		list.printList();
		System.out.println("Length of Linked List is: "+list.getLength());
	}

}
