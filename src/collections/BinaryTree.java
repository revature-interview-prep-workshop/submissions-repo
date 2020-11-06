package collections;

public class BinaryTree<T> {
    TreeNode<T> root;
    int size;
    int height;
    
    BinaryTree() {
        this.root = null;
        this.size = 0;
        this.height = 0;
    }
    
    public int size() {
        return size;
    }
    
    private boolean insertNode(TreeNode<T> current, TreeNode<T> n) {
        System.out.println(height);
        if (n.getData() == null) { return false; }
        if (root == null) { 
            root = n;
            size++;
            height++;
            return true;
        }
        else {
            while (current != null) {
                if (current.getLeft() == null) {
                    current.setLeft(n);
                    size++;
                    height++;
                    return true;
                }
                else if (current.getRight() == null) {
                    current.setRight(n);
                    size++;
                    return true;
                }
                else {
                    if (height % 2 == 0) {
                        return insertNode(current.getLeft(), current);
                    }
                    else {
                        return insertNode(current.getRight(), current);
                    }
                }
            }
        }
        return false;
    }
    
    public boolean insertNode(TreeNode<T> n) {
        return insertNode(root, n);
    }
    
 /*   public boolean contains(TreeNode<T> n) {
        if (n.getData() == null) { return false; }
        TreeNode<T> current =  
    }
    
    public remove() {
        
    }
*/
    
    void inOrder(TreeNode<T> node) // visits left -> current -> right, in a BST visits in ascending order
    { if (node == null) { return; }
    
      TreeNode<T> current = node;
      
      inOrder(current.getLeft());
      System.out.print(node.getRight() + " ");
      inOrder(current.getRight());
    }
    
    void inOrder() { inOrder(root); }

    
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode<>();
        root.setData(5);
        TreeNode<Integer> left = new TreeNode<>();
        left.setData(6);
        TreeNode<Integer> right = new TreeNode<>();
        right.setData(7);
        TreeNode<Integer> left2 = new TreeNode<>();
        left2.setData(8);
        TreeNode<Integer> right2 = new TreeNode<>();
        right2.setData(9);
        TreeNode<Integer> left3 = new TreeNode<>();
        left3.setData(10);
        bt.insertNode(root);
        bt.insertNode(left);
        bt.insertNode(right);
        bt.insertNode(left2);
        bt.insertNode(right2);
        bt.insertNode(left3);
        System.out.println(bt.height);
   }
}
