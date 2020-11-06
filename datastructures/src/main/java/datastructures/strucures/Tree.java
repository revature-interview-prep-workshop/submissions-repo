package datastructures.strucures;

public class Tree<T> {

	private Node root;

	public void insertNode(T data) {
		if (root == null) {
			root = new Node(data);
		} else {
			// we start at the top node
			Node current = root;
			Queue<Node> queue = new Queue<>();
			queue.enqueue(current);
			// while we still have entries to look at...
			while (!queue.isEmpty()) {
				// grab current node from queue
				current = queue.dequeue();
				// if the left is null
				if (current.left == null) {
					// create a new one and stop
					current.left = new Node(data);
					break;
					// not null, add it to queue
				} else
					queue.enqueue(current.left);
				if (current.right == null) {
					current.right = new Node(data);
					break;
				} else
					queue.enqueue(current.right);
			}

		}
	}
	
	public void insertNode(T[] data) {
		for(int i=0;i<data.length;i++) {
			insertNode(data[i]);
		}
		data=null;
	}
	
	public boolean removeNode(T data) {
		Node searched = null;
		Node current = null;
		Queue<Node> queue = new Queue<>();
		Node deepest = null;
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			boolean parent = false;
			current = queue.dequeue();
			
			if(searched == null && current.data == data) {
				searched = current;
			}
			if(current.left != null) {
				queue.enqueue(current.left);
				parent = true;
			}
			if(current.right != null) {
				queue.enqueue(current.right);
				parent=true;
			}
			if(parent) deepest = current;
		}
		if(searched==null) return false;
		searched.data=current.data;
		if(deepest != null && deepest.left != null && deepest.left.data == current.data) {
			deepest.left = null;
		} else deepest.right = null;
		
		return true;
	}
	
	public boolean contains(T data) {
		Queue<Node> queue = new Queue<>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			Node current = queue.dequeue();
			if(current.data==data) {
				return true;
			}
			if(current.left != null) {
				queue.enqueue(current.left);
			}
			if(current.right != null) {
				queue.enqueue(current.right);
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String out = "Root : " + root.data + " root left : " + root.left.data + " root right : " + root.right.data
				+ "\n";
		Node current = root;
		while (current != null) {
			out += "Current node : " + current.data
					+ (current.left != null ? " current left : " + current.left.data : "")
					+ (current.right != null ? " current right : " + current.right.data : "") + "\n";
			current = current.right;
		}
		return out;
	}

	private class Node {
		T data;
		Node left, right;

		private Node(T item) {
			data = item;
			left = null;
			right = null;
		}
	}
}
