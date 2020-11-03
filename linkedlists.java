// A sequence of elements in which one element links to another element
// It can be unsorted or sorted
// Can have any type of data e.g. Strings,Characters,numbers etc. 
// Can contain duplicate elements and all unique elements
//
//Slow to get to nth element takes linear time. 
public class Node {
      Node next; 
      int data; 
      public Node (int data) { 
                this.data = data; 
      }
}

public class LinkedList {
      Node head; 

    public void append(int data) {
      if (head == null) {
        head = new Node(data); 
        return; 
      }
      //head of linked list 
      Node current = this; 
      while (current.next != null) {
          current = current.next; 
      }
      current.next = new Node(data); 
   }
   public void prepend(int data) { 
   Node newHead = new Node(data); 
   newHead.next = head; 
   head = newHead; 
}

 public void deleteWithValue(int data) { 
        if (head == null) return; 
        if (head.data == data) {
        head = head.next; 
        return; 
        }

        Node current = head; 
        while (current.next != null) { 
            if (current.next.data == data) { 
            current.next = current.next.next; 
            return; 
          } 
          current = current.next; 
    }
}
