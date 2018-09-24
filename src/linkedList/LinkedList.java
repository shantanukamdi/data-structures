package linkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int data, int pos) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (pos == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			int count = 0;
			while (count < pos - 1) {
				n = n.next;
				count++;
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public void deleteAt(int pos) {
		if (pos == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			int count = 0;
			while (count < pos - 1) {
				n = n.next;
				count++;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Deleting " + n1.data);
			n1 = null;
		}
	}

}
