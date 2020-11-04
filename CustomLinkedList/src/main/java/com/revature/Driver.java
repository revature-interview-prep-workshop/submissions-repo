package com.revature;

import com.revature.linkedList.LinkedListImplementation;
import com.revature.queue.QueueImplementation;
import com.revature.stack.StackImplementation;

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

        System.out.println("Front item is "
                + queue.getFront());

        System.out.println("Rear item is "
                + queue.getRear());

    }
}
