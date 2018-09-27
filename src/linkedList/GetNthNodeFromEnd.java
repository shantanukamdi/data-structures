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
		getNthNodeFromEnd(list.head, 2);

	}

	public static int getNthNodeFromEnd(Node head, int pos) {
		int len = 0;
		Node n = head;
		while (n != null) {
			len++;
			n = n.next;
		}

		n = head;
		for (int i = 1; i < len - pos + 1; i++) {
			n = n.next;
		}

		System.out.println("Position " + pos + " from end of the list is "+n.data);
		return 0;
	}
}
