package stack;

public class MyStack {
	Node top;
	
	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (top == null) {
			top = new_node;
		} else {
			Node temp = top;
			top = new_node;
			top.next = temp;
		}
	}
	
	public void pop() {
		if (top == null) {
			System.out.println();
			System.out.println("stack DNE");
		}else {
			System.out.println();
			System.out.println(top.data + " has been removed"); 
			top = top.next;
		}
	}
	
	public void peek() {
		if (top == null) {
			System.out.println("Stack is empty, nothing to peek...");
		}else {
			System.out.println(top.data + " is the top element in the stack");
		}
	}
	
	public void isEmpty() {
		if (top == null) {
			System.out.println("STACK IS EMPTY");
		}else {
			System.out.println("Stack is not empty");
		}
	}
	
	public void print() {
		Node temp = this.top;
		while( temp != null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
		System.out.println();
	}
}
