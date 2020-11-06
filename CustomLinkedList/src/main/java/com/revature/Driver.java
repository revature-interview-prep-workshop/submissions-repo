package com.revature;

import com.revature.binaryTree.BinaryTree;
import com.revature.binaryTree.TreeNode;
import com.revature.hashTable.HashTable;
import com.revature.linkedList.LinkedListImplementation;
import com.revature.queue.QueueImplementation;
import com.revature.stack.StackImplementation;

import java.util.HashMap;

public class Driver {

    public static void main(String[] args) {
        LinkedListImplementation<String> stringList = new LinkedListImplementation<String>();
        stringList.addLast("hi");
        stringList.addLast("hey");
        stringList.addLast("hello");

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


        StackImplementation<Integer> s = new StackImplementation<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " Popped from stack");


        QueueImplementation<Integer> queue = new QueueImplementation<Integer>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()
                + " dequeued from queue\n");

//        System.out.println("Front item is "
//                + queue.getFront());
//
//        System.out.println("Rear item is "
//                + queue.getRear());


        BinaryTree tree = new BinaryTree();

        tree.setRoot(new TreeNode(1));

        tree.insertNode(2);
        tree.insertNode(3);

        tree.insertNode(4);

        System.out.println(tree.toString());

        System.out.println(tree.contains(tree.getRoot(), 4));


        HashTable<String, Integer> map = new HashTable<>();
        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        map.add("hi",5 );
        System.out.println(map.getSize());
        System.out.println(map.remove("this"));
        System.out.println(map.remove("this"));
        System.out.println(map.getSize());
        System.out.println(map.isEmpty());
    }
}
