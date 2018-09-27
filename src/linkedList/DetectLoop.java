package linkedList;

public class DetectLoop {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(15);
		list.insert(10);
		list.insert(9);
		list.insert(3);
		list.insert(33);
		list.insert(56);
		list.insert(89);

		list.head.next.next.next.next = list.head;

		if (detectLoop(list.head) == 1) {
			System.out.println("Loop Detected");
		} else {
			System.out.println("No loop detected");
		}

	}

	public static int detectLoop(Node head) {
		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return 1;
			}
		}
		return 0;
	}

}
