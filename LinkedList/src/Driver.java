
public class Driver {

	public static void main(String[] args) {
		
		MyLinkedList linkedList = new MyLinkedList();
		MyLinkedList.insert(linkedList, 1);
		MyLinkedList.insert(linkedList, 2);
		MyLinkedList.insert(linkedList, 3);
		MyLinkedList.insert(linkedList, 4);
		linkedList.addAtHead(8); 
		linkedList.addAtHead(9);
		linkedList.addAtTail(12);
		linkedList.addAtTail(0);
		MyLinkedList.printList(linkedList);
		linkedList.contains(9); 
		linkedList.contains(2);
		linkedList.contains(0);
		
	}

}
