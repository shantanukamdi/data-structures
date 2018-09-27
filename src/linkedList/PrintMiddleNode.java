package linkedList;

public class PrintMiddleNode {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(15);
		list.insert(10);
		list.insert(9);
		list.insert(3);
		list.insert(33);
		list.insert(56);
		list.insert(89);


		list.printList();
		
		printMiddle(list.head);
	}
	public static void printMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Middle node of the list is "+slow.data);
	}

}
