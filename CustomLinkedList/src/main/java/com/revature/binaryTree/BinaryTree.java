package com.revature.binaryTree;

public class BinaryTree {

    private TreeNode root;

    BinaryTree(int key)
    {
        root = new TreeNode(key);
    }

    public BinaryTree()
    {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insertNode(int key)
    {
        root = insertRec(root, key);
    }


    public TreeNode insertRec(TreeNode root, int key)
    {
        if (root == null)
        {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public TreeNode contains(TreeNode root, int key)
    {
        if (root==null || root.key==key)
            return root;

        if (root.key < key)
            return contains(root.right, key);

        return contains(root.left, key);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
