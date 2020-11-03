class Stack <T> {
    private int maxSize;
    private T[] array;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }
        array[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return array[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public void printStack() {
        while (top != -1) {
            System.out.println(peek());
            top--;
        }
    }
}