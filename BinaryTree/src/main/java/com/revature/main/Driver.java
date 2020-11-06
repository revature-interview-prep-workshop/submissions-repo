package com.revature.main;

import com.revature.data_structures.BinaryTree;

public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinaryTree bt = new BinaryTree();
        bt.insert(1, 55);
        bt.insert(2, 66);
        System.out.println(bt.contains(2));
        System.out.println(bt.contains(3));
        
    }

}
