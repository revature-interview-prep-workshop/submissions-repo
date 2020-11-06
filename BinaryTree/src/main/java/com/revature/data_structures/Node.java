package com.revature.data_structures;

public class Node {
    public int id;
    public double data;
    //both int and double can be replaced with an object;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode() {
        System.out.print("{");
        System.out.print(id);
        System.out.print(",");
        System.out.print(data);
        System.out.print("}");
    }
    public boolean isEmpty() {
       return(this == null);
    }
    
    

}
