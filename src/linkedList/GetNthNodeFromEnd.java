package linkedList;

public class GetNthNodeFromEnd {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// List is: 1->12->15->22
		// Insert at end position
		list.insert(12);
		list.insert(15);
		list.insert(22);

		list.insertAtStart(1);

		list.printList();

	}
	
	public static int getNthNodeFromEnd(Node head) {
		
		return 0;
	}
}
