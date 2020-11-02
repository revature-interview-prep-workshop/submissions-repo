public class LinkedListImp<T> {
	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size = 0;

	public LinkedListImp<T>() {}

	public LinkedListImp<T>(LinkedListNode<T> head, int size) {
		this.head = head;
		this.size = size;
	}

	public void add(T element) {
		LinkedListNode newElement = LinkedListNode(element, this.tail, null); 
		this.tail.next = element;
		this.tail = newElement;
		size++;
	}

	// removes first instance of element
	public void remove(T element) {
		// start at head node
		LinkedListNode<T> temp = head;
		while(temp.next != null) {
			// actually want referential equality in this case
			// allows us to modify elements in a linkedlist and have those changes propagate to our list
			if (temp.value == element) {
				// remove element and change pointers
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				size--;
				return;
			}
			temp = temp.next;
		}	
	}

	public boolean contains(T element) {
		if (head == null) {
			return false;
		}

		LinkedListNode<T> temp = head;

		do {
			if (temp.value == element) {
				return true;
			}
			temp = temp.next;
		} while(temp.next != null)

		return false;
	}

	public T get(int index) {
		if (head == null) {
			return false;
		}

		LinkedListNode<T> temp = head;
		
		for (int i = 0; i <= index; i++) {
			temp.next;
		}

		return temp.value;
	}


	// 0 confidence this is correct
	public void sort() {
		// fringe case
		if (size < 2) {
			return;
		}
		mergeSort(head);
	}

	private LinkedListNode mergeSort(LinkedListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}

		LinkedListNode mid = getMiddle();

		// need to test to check edge cases with ceil
		LinkedListImp<T> left = LinkedListImp<T>(head, this.size/2).sort()
		LinkedListImp<T> right = LinkedListImp<T>().add(mid, Math.ceil(this.size/2)).sort();

		// update pointers, head is now head of left, mid is head of right
		mid.getPrev().setNext(null);
		mid.setPrev(null);

		return merge(left,right);
	}

	private LinkedListNode merge(LinkedListNode left, LinkedListNode right) {
		LinkedListNode ret = null;
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}

		if (left.value < right.value) {
			ret = left;
			ret.setNext(merge(left.getNext(), right));
		} else {
			ret = right;
			ret.setNext(merge(right.getNext(), left))
		}

		return ret;
	}

	private LinkedListNode getMiddle() {
		LinkedListNode mid = head;
		int i = 0;

		// integer division
		while (i < size/2) {
			// traverse
			mid = head.getNext();
			i++;
		}
		// mid is now the center element after while loop executes
		return mid;
	}

	public int length() {
		return size;
	}
}