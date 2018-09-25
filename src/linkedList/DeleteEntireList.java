package linkedList;

public class DeleteEntireList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(15);
		list.insert(10);
		list.insert(9);
		list.insert(1);
		
		list.printList();
		
		System.out.println("Deleting entire list");
		deleteList(list);
		
		list.printList();
	}
	
	public static void  deleteList(LinkedList list) {
		list.head = null;
	}
}
