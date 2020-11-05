package stack;

public class Driver {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.print();
		stack.isEmpty();
		stack.peek();
		stack.pop();
		stack.peek();
		stack.print();
		stack.pop();
		stack.peek();
		stack.print();
		stack.pop();
		stack.pop();
		stack.isEmpty();
		stack.peek();
	}

}
