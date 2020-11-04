
public class MyLinkedList {
	Node head;
	Node tail;
	
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
	
	public void addAtHead(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtTail(int data) {
		Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			}
		
		Node last=head;
			while(last.next != null) {
				last=last.next;
			}
		last.next= newNode;
	}
	
	public void contains(int data) {
			Node temp = head;
			while(temp != null) {
				if( temp.data == data) {
					System.out.println();
					System.out.println("The linked list contains: " + data);
				}temp = temp.next;
				
			} 
	}
	
	public static void printList(MyLinkedList list) {
		Node current = list.head;
		
		System.out.println("Linked List: ");
		while(current != null) {
			System.out.print(current.data + " " );
			current = current.next;
		}
	}
	
	
}

