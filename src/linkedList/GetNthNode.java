package linkedList;

public class GetNthNode {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// List is: 1->12->15->22
		// Insert at end position
		list.insert(12);
		list.insert(15);
		list.insert(22);

		list.insertAtStart(1);

		list.printList();
		System.out.println("Get Nth Node Linked list");
		System.out.println(getNthNode(list.head, 0));

	}

	public static int getNthNode(Node head, int position) {
		int data;
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			if(count == position) {
				return temp.data;
			}
			count++;
			temp = temp.next;
		}
		return 0;
	}
}
