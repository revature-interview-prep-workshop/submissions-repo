package com.revature.data_structures;

public class LinkedList {
    public Link first;
    
    public LinkedList() {
        first = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next =first; //newLink now refers to the original first link
        first = newLink; //first now refers to the new link.        
    }
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        //if the id of the current link doesn't match then continue.
        while(current.data != key) { 
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
        while(current.data != key) {
            if(current.next == null) {
                System.out.println("The link was not found");
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
    public Link add(Link first, int data, int index) {
        Link newLink = new Link(data);
        Link temp = first;
        Link current = first;
        Link previous = null;
        newLink.next = null;
        int i = 0;
        if(first == null) {
            if(index != 0) {
                return null;
            }
            else {
                first = newLink;
                return newLink;
            }
        }
        if(first != null & index == 0) {
            newLink.next = first;
            first = newLink;
            return newLink;
        }
        while(i < index) {
            previous = current;
            current = current.next;
            if(current == null) {
                return null;
            }
            i++;
        }
        newLink.next = current;
        previous.next = newLink;
        return first;
        
        
        
        
    }
    public void addLast(Link link) {
        Link current = first;
        while(true) {
            if(current.next == null) {
                current.next = link;
                break;
            }
            else {
                current = current.next;
            }
           
        }
    }
    public  boolean contains(Link link) {
       Link current = first;
        while(true) {
           if(current.data == link.data) {
               return true;
           }
           if(current.next == null) {
               return false;
           }
           current = current.next;
       }
    }
    
}
