package com.revature.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PLinkedList<T> implements List {
	
	private PLinkedListNode<T> first;
	private PLinkedListNode<T> last;
	private int size;
	
	public boolean add(Object arg0) {
		PLinkedListNode newNode = new PLinkedListNode(arg0);
		if(first == null) {
			first = newNode;
			last = newNode;
			size++;
			return true;
		}
		else {
			PLinkedListNode<T> currentNode = first;
			last.setNext(newNode);
			last = last.getNext();
			size++;
			return true;
		}
	}

	public void add(int arg0, Object arg1) {
		PLinkedListNode newNode = new PLinkedListNode(arg1);
		if(arg0 < 0 || arg0 > size) {
			throw new IndexOutOfBoundsException(""+arg0);
		}
		else if(arg0 == size) {
			add(arg1);
		}
		else if(arg0 == 0) {
			PLinkedListNode<T> temp = first;
			first = newNode;
			newNode.setNext(temp);
			size++;
		}
		else {
			PLinkedListNode<T> currentNode = first;
			for(int i = 0; i < arg0-1; i++) {
				currentNode = currentNode.getNext();
			}
			PLinkedListNode<T> temp = currentNode.getNext();
			currentNode.setNext(newNode);
			newNode.setNext(temp);
			size++;
		}
	}

	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		first = last = null;
		size = 0;
	}

	public boolean contains(Object arg0) {
		PLinkedListNode<T> currentNode = first;
		while(currentNode != null) {
			if(currentNode.getValue().equals(arg0)) {
				return true;
			}
			currentNode = currentNode.getNext();
		}
		return false;
	}

	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(int arg0) {
		if(size == 0) return null;
		if(arg0 < 0 || arg0 > size) {
			throw new IndexOutOfBoundsException(""+arg0);
		}
		else {
			PLinkedListNode<T> currentNode = first;
			for(int i = 0; i < arg0; i++) {
				currentNode = currentNode.getNext();
			}
			return currentNode.getValue();
		}
		
	}

	public int indexOf(Object arg0) {
		PLinkedListNode<T> currentNode = first;
		int count = 0;
		while(currentNode != null) {
			if(currentNode.getValue().equals(arg0)) {
				return count;
			}
			currentNode = currentNode.getNext();
			count++;
		}
		return -1;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object arg0) {
		PLinkedListNode<T> currentNode = first;
		int count = 0;
		int lastIndexFound = -1;
		while(currentNode != null) {
			if(currentNode.getValue().equals(arg0)) {
				lastIndexFound = count;
			}
			currentNode = currentNode.getNext();
			count++;
		}
		return lastIndexFound;
	}

	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object arg0) {
		PLinkedListNode<T> currentNode = first;
		if(first.getValue().equals(arg0)) {
			first = first.getNext();
			size--;
			return true;
		}
		else if(size > 1) {
			//Iterate to the node before the target, or until the end
			while(currentNode.getNext() != null && !currentNode.getNext().getValue().equals(arg0)) {
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext() == null) {
				return false;
			}
			else {
				PLinkedListNode<T> toRemove = currentNode.getNext();
				currentNode.setNext(toRemove.getNext());
				size--;
				if(toRemove.equals(last)) {
					last = currentNode;
				}
				return true;
			}
		}
		return false;
	}

	public Object remove(int arg0) {
		if(arg0 < 0 || arg0 > size) {
			throw new IndexOutOfBoundsException(""+arg0);
		}
		T foundObject = null;
		PLinkedListNode<T> currentNode = first;
		//Iterate to the node before the target, or to the end
		for(int i = 0; i < arg0-1; i++) {
			currentNode = currentNode.getNext();
		}
		if(arg0 == 0) {
			foundObject = first.getValue();
			first = first.getNext();
			if(first.equals(last)) {
				last = null;
			}
			size--;
		}
		else {
			PLinkedListNode<T> toRemove = currentNode.getNext();
			foundObject = toRemove.getValue();
			currentNode.setNext(toRemove.getNext());
			if(toRemove.equals(last)) {
				last = currentNode;
			}
			size--;
		}
		return foundObject;
	}

	public boolean removeAll(Collection arg0) {
		return false;
	}

	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object set(int arg0, Object arg1) {
		if(size == 0) return null;
		if(arg0 < 0 || arg0 > size) {
			throw new IndexOutOfBoundsException(""+arg0);
		}
		else {
			PLinkedListNode<T> currentNode = first;
			for(int i = 0; i < arg0; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.setValue((T) arg1);
			return currentNode.getValue();
		}
	}

	public int size() {
		return size;
	}

	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString() {
		String out = "PLinkedList[";
		if(first != null) {
			PLinkedListNode<T> currentNode = first;
			while(currentNode != null) {
				out += currentNode.getValue();
				if(currentNode != last) {
					out += ", ";
				}
				currentNode = currentNode.getNext();
			}
		}
		out += "]";
		return out;
	}

}
