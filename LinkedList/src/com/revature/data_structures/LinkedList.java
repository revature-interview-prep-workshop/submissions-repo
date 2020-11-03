package com.revature.data_structures;

public class LinkedList {
    public Link first;
    
    public LinkedList() {
        first = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int id, int x, int y) {
        Link newLink = new Link(id,x,y);
        newLink.next =first; //newLink now refers to the original first link
        first = newLink; //first now refers to the new link.        
    }
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        //if the id of the current link doesn't match then continue.
        while(current.id != key) { 
            if(current.next == null) {
                System.out.println("Link not found");
                return null;
            }
            else {
                //go to the next link
                previous = current;
                current = current.next;
            }
        } 
        if(current == first) {
            first = first.next;
        }
        else {
            previous.next = current.next;
        }
        return current;
    }
    public Link find(int key) {
        Link current = first;
        while(current.id != key) {
            if(current.next == null) {
                System.out.println("The link was found");
                return null;
            }
            else {
                current = current.next;
            }
        }
        System.out.println("Link found");
        return current;
    }
    public void displayList() {
        System.out.println("List: ");
        Link current = first;
        while(current!=null) {
            current.displayLink();
            current = current.next;
        }
    }
    
}
