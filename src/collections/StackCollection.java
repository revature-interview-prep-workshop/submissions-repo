package collections;

class Stack
{ Node head;
  int size;

  Stack() 
  { head = null;
    size = 0;
  }
  
  void getSize()
  { if (head.data != null) { System.out.println(size+1); }
    else { System.out.println("Empty"); }
  }
  
  void print(Node node)
  { if (node == null) 
    { System.out.println();
      return;
    }
    System.out.print(node.data + " ");
    print(node.next);
  }
  
  void print() { print(head); }
  
  void push(Node node)
  { Node current = head;
    head = node;
    head.next = current;
    size++;
  }
  
  void pop()
  { System.out.println(head.data);
    head = head.next;
    size--;
  }
  
  void peek()
  { System.out.println(head.data); }
  
}

public class StackCollection {
    public static void main(String[] args)
    { Stack s = new Stack();
      s.head = new Node("Sleepy");
      Node test1 = new Node("Very");
      Node test2 = new Node("I'm");
      s.push(test1);
      s.push(test2);
      
      s.print();
      s.pop();
      s.print();
      s.peek();
    }
}
