public class Queue{
	private int size;
	
	private int[] array;
	
	private int head;
	
	private int tail;
	
	private int numItems;
	
	public Queue(int s){
		size = s;
		array = new int[size];
		head = 0;
		tail = -1;
		nItems = 0;
	}
	
	public void insert(int j){
		if(tail == size - 1){
			tail = -1;
		}
		array[++tail] = j;
		numItems++;
	}
	
	public void remove(int j){
		int temp = array[head++];
		if(head == size){
			head = 0;
		}
		numItems--;
		return temp;
	}
}
	