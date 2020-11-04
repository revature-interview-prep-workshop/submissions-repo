class LinkedListMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.printLinkedList();

        ll.addLast(1);
        ll.printLinkedList();
        
        ll.add(3, 1);
        ll.printLinkedList();

        ll.add(9, 2);
        ll.printLinkedList();

        ll.add(4, 0);
        ll.printLinkedList();

        System.out.println(ll.contains(10));
        System.out.println(ll.contains(9));
    }
}