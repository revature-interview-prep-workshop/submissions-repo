
public class LinkedList {
	
	
public static void main(String[]args) {
	LinkedList list= new LinkedList();
	list.addNode(0);
	list.addNode(5);
	list.addNode(2);
	list.addNode(6);
	list.addNode(9);
	list.addNode(3);
	list.display();
}
	
	
	
	
	
	

public Node head=null;
public Node tail=null;

public void addNode(int data ) {
	Node newNode=new Node(data);
	
	if(head==null) {
		head=newNode;
		tail=newNode;
	}else {
		tail.next=newNode;
		tail=newNode;
	}
	
}

public void display() {
	Node current =head;
	if(head==null) {
		System.out.println("This list is empty");
		return;
	}
	System.out.println("There are the nodes of the list: ");
	while (current!=null) {
		System.out.print(current.data + " ");
		current = current.next;
	}
	System.out.println();
}


	
	
}
