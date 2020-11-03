package com.revature.models;

public class Node<E> {
    E data;
    Node<E> next;
    //Default Constructor
    public Node()
    {
      data = null;
      next = null;
    }
    //Custom Constructor
    public Node(E x)
    {
      data = x;
      next = null;
    }
  }
