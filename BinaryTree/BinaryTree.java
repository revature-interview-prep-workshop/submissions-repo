class Node<T>
{
	T data;
	Node<T> left, right;

	Node(T data) {
		this.data = data;
	}
}

class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    public void insertNode(T data) {
		root = insertNode(root, data);
    }
    
	private Node<T> insertNode(Node<T> root, T data) {
		if (root == null) {
			return new Node<T>(data);
		} else if (data.compareTo(root.data) < 0) {
			root.left = insertNode(root.left, data);
		} else if (data.compareTo(root.data) > 0) {
			root.right = insertNode(root.right, data);
        } else {
            return root;
        }
		return root;
    }
    
    public void removeNode(T data) {
		root = removeNode(root, data);
    }
    
    private Node<T> removeNode(Node<T> root, T data) {
		if (root == null) {
			return null;
		} else if (data.compareTo(root.data) < 0 ) {
			root.left = removeNode(root.left, data);
		} else if (data.compareTo(root.data) > 0) {
			root.right = removeNode(root.right, data);
		} else {
            if (root.left == null && root.right == null) {
				return null;
            } else if (root.right == null) {
				return root.left;
            } else if (root.left == null) {
				return root.right;
            } else {
				root.data = findMax(root.left);
				root.left = removeNode(root.left, root.data);
			}
		}
		return root;
    }
    
    public boolean contains(T data) {
		return contains(root, data);
	}

    private boolean contains(Node<T> root, T data) {
		if (root == null) {
			return false;
		} else if (data.compareTo(root.data) < 0) {
			return contains(root.left, data);
		} else if (data.compareTo(root.data) > 0) {
			return contains(root.right, data);
		} else {
			return true;
		}
    }
    
    private T findMax(Node<T> root) {
		while (root.right != null) {
			root = root.right;
		}
		return root.data;
    }
}
