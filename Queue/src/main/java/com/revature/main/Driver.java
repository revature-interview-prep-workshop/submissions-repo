package com.revature.main;

import com.revature.data_structure.Queue;

public class Driver {
    public static void main(String[] args) {
        Queue queue1 = new Queue(5);
        queue1.insert(1);
        queue1.insert(6);
        queue1.insert(1);
        queue1.insert(8);
        queue1.insert(0);
        queue1.insert(3);
        queue1.insert(100);
        queue1.remove();
        queue1.remove();
        printQueue(queue1);
    }
    public static void printQueue(Queue queue) {
        while(!queue.isEmpty()) {
            long n = queue.remove();
            System.out.println(n);
        }
    }

}
