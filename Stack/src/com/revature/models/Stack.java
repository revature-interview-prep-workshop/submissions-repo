package com.revature.models;

public class Stack<E> {
  
  private Node<E> top;
  private int numItems;
  
  //Default Constructor
  public Stack()
  {
    top = null;
    numItems = 0;
  }
  //push Method
  public void push(E x)
  {
    Node<E> p = new Node<E>(x);
    p.next = top;
    top = p;
    numItems++;
  }
  //pop Method
  public E pop()
  {
    if(numItems == 0)
    {
      System.out.println("Stack Underflow");
      System.exit(0);
    }
    E temp = top.data;
    top = top.next;
    numItems--;
    return temp;
  }
  //peek Method
  public E peek()
  {
    if(numItems == 0)
    {
      System.out.println("Stack Underflow");
      System.exit(0);
    }
    return top.data;
  }
  //empty Method
  public boolean empty()
  {
    return (numItems == 0);
  }
  //size Method
  public int size()
  {
    return numItems;
  }
}