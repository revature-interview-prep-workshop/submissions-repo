package com.revature.data_structures;

public class BinaryTree {
    private Node root;
    
    public BinaryTree() {
        this.root = null;
    }
    public Node find(int key) {
        
        Node current = root;
        while(current.id != key) {
            if(key < current.id) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            } 
        }
        return current;
        
    }
    public void insert(int id, int data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        //if the root is null and so the tree is empty, and the 
        //new node is the root node
        if(root== null) {
            root = newNode;
        }
        //if the root is not null;
        else {
            //get the root
            Node current = root;
            Node parent;
            while(true) {
                //set the current as a parent node
                parent = current;
                //if the id of the new node is less than the current id
                //continue on to the left child, being that the left child
                //holds descending id values, whereas the right child holds ascending values
                if(id < current.id) {
                    //the current node is now the left child
                    current = current.leftChild;
                    //if the current node is null then insert the new node
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                    //if the current node is not node, continue on to next left child
                }
                else {
                    //if the new node id is greater than the current then move on to the right child
                    current = current.rightChild;
                    //if the current is null then add the right child to the current node aka parent.
                    if(current == null ) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
        
    }
    public boolean contains(int id) {
        Node current = root;
        if(current == null) {
            return false;
        }
        while(id != current.id) {
            if(id < current.id) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
            if(current == null) {
                return false;
            }
        }
        return (!current.isEmpty());
    }
    public boolean delete(int id) {
        if(this.root == null) {
            return false;
        }
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while(id != current.id) {
            parent = current;
            if(id < current.id) {
                isLeftChild = true;
                current = current.leftChild;
            }
            else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null) {
                return false;
            }
        }
        //if the current node has no children
        if(current.leftChild == null && current.rightChild == null) {
            //if the current node is the root node, then say the root to null
            if(current == root) {
                root = null;
            }
            //if the node in question is the left child, set 
            //parent.left child to null, you are deleting the left child
            else if(isLeftChild) {
                parent.leftChild = null;
            }
            //delete the right child
            else {
                parent.rightChild = null;
            }  
        }
        else if(current.rightChild == null) {
            if(current == root) {
                root = current.leftChild;
            }
            else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            }
            else {
                parent.rightChild = current.leftChild;
            }
        }
        else if(current.leftChild == null ) {
            if(current == root) {
                root = current.rightChild;
            }
            else if(isLeftChild) {
                parent.leftChild = current.rightChild;
            }
            else {
                parent.rightChild = current.rightChild;
            }
        }
        else {
            Node successor = getSuccessor(current);
            if(current == root) {
                root = successor;
            }
            else if(isLeftChild) {
                parent.leftChild = successor;
            }
            else {
                parent.rightChild = successor;
            }
        }
        return true;   
    }
    public Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }
    

}
