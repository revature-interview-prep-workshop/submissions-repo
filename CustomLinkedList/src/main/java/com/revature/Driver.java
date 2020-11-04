package com.revature;

import com.revature.linkedList.LinkedListImplementation;

public class Driver {

    public static void main(String[] args) {
        LinkedListImplementation<String> stringList = new LinkedListImplementation<String>();
        stringList.insert("hi");
        stringList.insert("hey");
        stringList.insert("hello");

        stringList.printLinkedList();

        System.out.println(stringList.peek());
        System.out.println(stringList.peek());
        System.out.println(stringList.poll());
        System.out.println(stringList.poll());

        String key = "hello";
        boolean wasRemoved = stringList.removeByKey(key);

        if (wasRemoved) {
            System.out.println("The value " + key + " was removed.");
        } else {
            System.out.println("There was no " + key + "to remove");
        }

        stringList.printLinkedList();
    }
}
