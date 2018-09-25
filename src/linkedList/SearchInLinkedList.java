package linkedList;

public class SearchInLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int number = 122;
		// List is: 1->12->15->22
		list.insert(12);
		list.insert(15);
		list.insert(22);

		list.insertAtStart(1);

		list.printList();
		System.out.println(search(list.head, number));

	}
	
	public static boolean search(Node node, int number) {
		Node n = node;
		while(n.next != null) {
			if(n.data == number) {
				return true;
			}
			n = n.next;
		}
		return false;
	}
}
