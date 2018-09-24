package linkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		// Insert at end position
		list.insert(12);
		list.insert(15);
		list.insert(22);
		
		list.printList();
		System.out.println("----");
		// Insert at start position
		list.insertAtStart(1);
		list.printList();
		System.out.println("----");
		// Insert at any position
		list.insertAt(2, 3);
		list.printList();
		
	}

}
