public class myTree {

	Node root;

	private myTree createTree(){
		myTree t=new myTree();
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);
		t.add(4);

		return t;
	}



	public void add(int data){
		root = addRecursive(root, data);
	}

	private Node addRecursive(Node cur, int data){
		if(cur==null){
			return new Node(data);
		}

		if (data<cur.data){
			cur.left=addRecursive(cur.left, data);
		} else if (data > cur.data){
			cur.right=addRecursive(cur.right, data);
		}else{
			return cur;
		}
		return cur;
	}

	public boolean containsNode(int data) {
		return containsNodeRecursive(root, data);
	}

	private boolean containsNodeRecursive(Node cur, int data){
		if(cur==null){
			return false;
		}
		if(data == cur.data){
			return true;
		}
		return data < cur.data
		?containsNodeRecursive(cur.left, data)
		:containsNodeRecursive(cur.right,data);
	}

	public void deleteNode(int data){
		root = deleteRecursive(root, data);
	}

	private Node deleteRecursive(Node cur, int data){
		if (cur==null){
			return null;
		}
		if (data == cur.data){
			int smallestValue=findSmallValue(cur.right);
			cur.data=smallestValue;
			cur.right= deleteRecursive(cur.right, smallestValue);
			return cur;
		}
		if(data < cur.data){
			cur.left=deleteRecursive(cur.left, data);
			return cur;
			}
		cur.right = deleteRecursive(cur.right, data);
		return cur;
	}

	private int findSmallValue(Node root){
		return root.left==null ? root.data : findSmallValue(root.left);
	}
}

