public class LinkedList {
	
	 private Node head;
	
	 public LinkedList()
	 {
		 super();
	 }
 
 
	public void insert(Object data)
	{
		Node node = new Node (data);
		
		if (this.head == null)
		{
			this.head = node;
		}
		else 
		{
			Node currentNode = this.head;
			
			while(currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			
			currentNode.next = node;
		}
	}
	
	public void delete(Object data)
	{
		
		if (this.head.data == data)
		{
			this.head = this.head.next;
		}
		
		else 
		{
			Node currentNode = this.head;
			
			while(currentNode.next.data != data)
			{
				currentNode = currentNode.next;
			}
			
			try
			{
				currentNode.next = currentNode.next.next;
			} catch (NullPointerException e)
			{
				currentNode.next = null;
			}
			
		}
		
		

	}
	
	public void print()
	{
		Node head = this.head;
		while(head != null)
		{
			System.out.print(head.data +" ");
			head = head.next;
		}
		
		System.out.println("");
	}
	
	public static void main(String[]args)
	{
		LinkedList myList = new LinkedList();
		
		myList.insert("Hello");
		myList.insert("World");
		myList.insert("This");
		myList.insert("Is");
		myList.insert("A");
		myList.insert("Linked");
		myList.insert("List");
		myList.insert("Of");
		myList.insert("Strings");
		
		myList.print();
		
		myList.delete("World");
	
		myList.print();

	}
 
}



class Node {
	
	Object data;
	Node next;
	
	public Node (Object data) 
	{
		
		this.data = data;
		this.next = null;
		
	}
	
}