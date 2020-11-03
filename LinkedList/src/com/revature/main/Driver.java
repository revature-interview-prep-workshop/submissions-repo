package com.revature.main;

import com.revature.data_structures.Link;
import com.revature.data_structures.LinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10,10,10);
        list.insertFirst(2,14,15);
        list.insertFirst(5,2,314);
        list.insertFirst(3,23,1);
        list.insertFirst(63,11,1000);
        list.displayList();
        list.delete(2);
        list.displayList();
        Link link1 = list.find(5);
        Link link2 = list.find(11);   
    }
}
