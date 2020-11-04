public class myQueue{

private  int arr[];
private int front;
private int rear;
private int capacity;
private int count;

myQueue(int size){
	arr = new int[size];
	capacity=size;
	front=0;
	rear=-1;
	count=0;
}

public void dequeue(){
	if(isEmpty()){
	System.out.println("The queue is empty");
	System.exit(1);
}
	System.out.println("Removing " +arr[front]);
	front=(front+1)% capacity;
	count--;
}

public void enqueue(int data){
	if(isFull())
	{
		System.out.println("The queue is full");
		System.exit(1);
	}

	System.out.println("Inserting " +data);
	rear = (rear+1)%capacity;
	arr[rear]=data;
	count++;
}

	public int peek (){
		if(isEmpty()){
			System.out.println("The queue is empty");
			System.exit(1);
}
return arr[front];
}

public int size(){
	return count;
	}

	public Boolean isFull(){
		return (size() == capacity);
	}

	public Boolean isEmpty()
	{
		return (size()==0);
	}

	public static void main (String[] args){
		myQueue q = new myQueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		System.out.println("The first item is " +q.peek());
		System.out.println(q.size());
}
}