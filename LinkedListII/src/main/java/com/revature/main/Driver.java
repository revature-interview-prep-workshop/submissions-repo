package com.revature.main;

import com.revature.data_structures.Link;
import com.revature.data_structures.LinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(630);
        list.delete(2);
        list.displayList();
        Link link1 = list.find(5);
        Link link2 = list.find(11);
        Link link3 = list.add(list.first, 777, 2);
        list.displayList();

        Link link4 = new Link(999);
        list.addLast(link4);
        list.displayList();
        System.out.println(list.contains(link3));

    }
}
