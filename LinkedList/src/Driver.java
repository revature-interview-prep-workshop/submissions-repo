
public class Driver {

	public static void main(String[] args) {
		
		MyLinkedList linkedList = new MyLinkedList();
		MyLinkedList.insert(linkedList, 1);
		MyLinkedList.insert(linkedList, 2);
		MyLinkedList.insert(linkedList, 3);
		MyLinkedList.insert(linkedList, 4);
		
		MyLinkedList.printList(linkedList);
	}

}
