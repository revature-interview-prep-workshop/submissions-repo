class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.dequeue();
        System.out.println(queue.peek());
    }
}