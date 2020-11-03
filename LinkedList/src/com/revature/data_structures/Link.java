package com.revature.data_structures;

public class Link {
    public int id;
    public int x;
    public int y;
    public Link next;
    
    public Link(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public void displayLink() {
        System.out.println(this.id + ": " + this.x + ", " + this.y);
    }
}
