public class LinkedListNode<T> {
	public T prev;
	public T value;
	public T next;

	public LinkedListNode<T>(T val) {
		this.value = val;
	}

	public LinkedListNode<T>(T val, LinkedListNode prev, LinkedListNode next) {
		this.value = val;
		this.prev = prev;
		this.next = next;
	}

	public boolean isTail() {
		return (next == null);
	}

	public boolean isHead() {
		return (prev == null);
	}
}