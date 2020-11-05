package com.Revature.examples;

public class LinkedListExample_II {

    private Node2 head;
	private int location = 0;
	
	 public LinkedListExample_II() {
		 super();
     }
	 
	 
	 //MAIN METHOD
     public static void main(String [] args) {
         
    	 LinkedListExample_II list = new LinkedListExample_II();

         list.addFirst(1);
         list.addFirst(2);
         list.addLast(7);
         list.addLast(8);
         list.addFirst(3);
         list.print();

         list.add(0,3);
         list.print();
}



	 
	 //METHODS
	 
	  public void add (Object data, int index) {
	        
		  Node2 node = new Node2 (data);
	        
		  if (index == 0) {
	            addFirst(data);
	        }
		  
		  else 
			{
				Node2 currentNode = this.head;
				
				while(currentNode.next.index < index-1) {
					currentNode = currentNode.next;
				}
	            
	            node.next = currentNode.next;
				currentNode.next = node;
			}
	     }

	     public void addFirst(Object data) {
	    	 
	        Node2 node = new Node2 (data);

			if (this.head == null) {
	            
				this.head = node;
	            node.index =0;
			}
			
			else 
			{
	            node.next = this.head;
	            this.head.index++;	

	            Node2 currentNode = this.head;
				
				while(currentNode.next != null) {
	               
					currentNode.index = location;
	                location++;
					currentNode = currentNode.next;
				}
	        }
	        
	        this.head = node;
	     }
	     
	     public void addLast(Object data) {
	        
	    	 Node2 node = new Node2 (data);
			
			if (this.head == null) {
				
				this.head = node;
			}
			
			else 
			{
				Node2 currentNode = this.head;
				
				while(currentNode.next != null) {
					
					currentNode = currentNode.next;
				}
				
				currentNode.next = node;
			}
	     }
	     
	     public void print() {
	 		
	    	 Node2 head = this.head;
	 		
	    	 while(head != null) {
	 			
	    		 System.out.print(head.data + "");
	 			head = head.next;
	 		}
	 		
	 		System.out.println("");
	 	}
	
	
	//NODE Class and Object
	class Node2 {
		
		Object data;
		Node2 next;
	    int index;
	    
	public Node2 (Object data) {
		this.data = data;
		this.next = null;
		this.index = 0;
			
		}    
	    
	}
	

}
