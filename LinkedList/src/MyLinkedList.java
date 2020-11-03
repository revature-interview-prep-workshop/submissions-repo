
public class MyLinkedList {
	Node head;
	
	public static MyLinkedList insert(MyLinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (list.head == null) {
			list.head = new_node;
		}else {
			Node prev = list.head;
			while(prev.next != null) {
				prev= prev.next;
			}
			prev.next = new_node;
		}
		return list;
	}
	
	public static void printList(MyLinkedList list) {
		Node current = list.head;
		
		System.out.println("Linked List: ");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}

