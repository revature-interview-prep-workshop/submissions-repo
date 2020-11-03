class LinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(4);
        sll.printLinkedList();
        // 4 => 3 => 2 => 1 =>
        
        sll.deleteFirst();
        sll.printLinkedList();
        // 3 => 2 => 1 =>

        sll.deleteFirst();
        sll.deleteFirst();
        sll.printLinkedList();
        // 1 =>

        sll.deleteFirst();
        sll.printLinkedList();
        // 

        System.out.println(sll.isEmpty());
        // true

        sll.insertFirst(1);
        sll.insertLast(4);
        sll.insertFirst(2);
        sll.printLinkedList();
        // 2 => 1 => 4 =>

        System.out.println(sll.isEmpty());
        // false

        Node n1 = new Node();
        n1.data = 1;
        sll.deleteAfter(n1);
        sll.printLinkedList();
        // 2 => 1 =>
        sll.deleteFirst();
        sll.deleteFirst();
        sll.printLinkedList();

        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(4);
        sll.insertFirst(5);
    
        Node n2 = new Node();
        n2.data = 4;
        sll.deleteAfter(n2);
        sll.printLinkedList();
        // 5 => 4 => 2 => 1 =>

        sll.insertLast(100);
        sll.printLinkedList();
        // 5 => 4 => 2 => 1 => 100

    }
}