package data;

class Node 
{ Object data;
  Node next;
  
  public Node(Object element)
  { data = element;
    next = null;
  }
  
}

class SinglyLinkedList
{ Node head;
  SinglyLinkedList() { head = null; }

  void print(Node node)
  { if (node == null) { return; }
    System.out.print(node.data + " ");
    print(node.next);
  }
  
  void print() { print(head); }
  
  void add(Object data) {
      Node node = new Node(data);
      if (head == null) {
          head = node;
      }
      else {
          Node runner = head;
          while (runner.next != null) {
              runner = runner.next;
          }
          runner.next = node;
      }
  }
  
  void delete(Object data) {
      if (this.head.data == data) {
          this.head = this.head.next;
      }
      
      else {
          Node current = this.head;
          
          while(current.next.data != data) {
              current = current.next;
          }
          
          try {
              current.next = current.next.next;
          } catch (NullPointerException e) {
              current.next = null;
          } 
      }
  }
  
  void removeDuplicates(Node node) {
      Node current = node;
      Node runner = null;
      while (current != null) { 
          runner = current;
          while (runner.next != null) {
              if (runner.next.data.equals(current.data)) {
                  runner.next = runner.next.next;
              }
              else {
                  runner = runner.next;
              }
          }
          current = current.next;
      }
  }
  
  void removeDuplicates() { removeDuplicates(head); }
}

public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add("This");
        sll.add("Ain't");
        sll.add("It");
        sll.add("Chief");
        sll.add("Chief");
        sll.removeDuplicates();
        sll.print();
    }
}
