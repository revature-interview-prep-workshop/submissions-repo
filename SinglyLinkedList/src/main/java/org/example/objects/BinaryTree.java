package org.example.objects;

public class BinaryTree {


    public TreeNode root;
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }


    public void insert(int data) {
        this.root = this.insertHelper(this.root, data);
    }


    private TreeNode insertHelper(TreeNode currNode, int data) {
        if(currNode == null) {
            return new TreeNode(data);
        }
        if(currNode.data > data) {
            System.out.println("HERE");
            currNode.left = insertHelper(currNode.left, data);
        } else if(currNode.data < data) {
            System.out.println("HERE 2");
            currNode.right = insertHelper(currNode.right, data);
        } else {
            System.out.println("HERE 3");
            return currNode;
        }

        return currNode;
    }
    public boolean contains(int data) {
        return containsHelper(this.root, data);
    }


    private boolean containsHelper(TreeNode node, int data) {
        if (node.data == data) {
            return true;
        }

        if(node.left == null && node.right == null) {
            return false;
        }
        else if (node.data > data) {
            return containsHelper(node.left, data);
        } else {
            return containsHelper(node.right, data);
        }
    }


    public void remove(int data) {
        this.root = removeHelper(this.root, data);
    }

    private TreeNode removeHelper(TreeNode treeNode, int data) {
        if(treeNode == null) {
            return null;
        }

        if(treeNode.data == data) {
            if(treeNode.left == null && treeNode.right == null) {
                return null;
            }

            if(treeNode.right == null) {
                return treeNode.left;
            }

            if(treeNode.left == null) {
                return treeNode.right;
            }

            int smallest = this.deletionHelper(treeNode.right);

            treeNode.data = data;

            this.removeHelper(treeNode.right, data);
            return treeNode;
        }
        if (treeNode.data > data) {
            treeNode.left = removeHelper(treeNode.left, data);
            return treeNode;
        } else {
            treeNode.right = removeHelper(treeNode.right, data);
            return treeNode;
        }


    }


    private int deletionHelper(TreeNode treeNode) {
        if(treeNode.left == null) {
            return treeNode.data;
        } else {
            return deletionHelper(treeNode.left);
        }
    }

}
