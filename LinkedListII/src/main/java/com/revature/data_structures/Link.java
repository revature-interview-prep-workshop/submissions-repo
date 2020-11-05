package com.revature.data_structures;

public class Link {
    public int data;
    public Link next;
    
    public Link(int data) {
        this.data = data;
    }
    public void displayLink() {
        System.out.println(this.data);
    }
}
