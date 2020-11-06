package datastructures.strucures;

import java.util.ArrayList;

public class HashTable<K,V> {

	private int size, numBuckets;
	
	private ArrayList<Node<K,V>> bucketList;
	
	//adds a k/v to the hash table
	public void add(K key, V value) {
		int index = getIndex(key);
		Node<K,V> head = bucketList.get(index);
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head=head.next;
		}
		size++;
		head = bucketList.get(index);
		Node<K,V> newN = new Node<K,V>(key, value);
		newN.next = head;
		bucketList.set(index, newN);
		
		if((1.0*size)/numBuckets >= 0.7) {
			ArrayList<Node<K,V>> temp = bucketList;
			bucketList = new ArrayList<>();
			numBuckets *= 2;
			size=0;
			for(int i=0;i<numBuckets;i++) {
				bucketList.add(null);
			}
			for(Node<K,V> newHead: temp) {
				while(newHead != null) {
					add(newHead.key, newHead.value);
					newHead = newHead.next;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String out = "\n[";
		for(int i=0;i<=size;i++) {
			if(bucketList.get(i) != null) {
				out += " Key: " + bucketList.get(i).key + " Value: " + bucketList.get(i).value;
			}
		}
		return out + " ]\n";
	}
	
	public V get(K key) {
		int index = getIndex(key);
		Node<K,V> head = bucketList.get(index);
		
		while(head != null) {
			if(head.key.equals(key)) return head.value;
			
			head=head.next;
		}
		return null;
	}
	
	public HashTable() {
		bucketList = new ArrayList<>();
		numBuckets = 10;
		size=0;
		
		for(int i=0;i<numBuckets;i++) {
			bucketList.add(null);
		}
	}
	
	private int getIndex(K key) {
		int hashCode = key.hashCode();
		return hashCode % numBuckets;
	}
	
	public V remove(K key) {
		int index = getIndex(key);
		Node<K,V> head = bucketList.get(index);
		Node<K, V> previous = null;
		while(head != null) {
			if(head.key.equals(key))
				break;
			
			previous = head;
			head = head.next;
		}
		if(head==null) {
			return null;
		}
		
		size--;
		if(previous != null) {
			previous.next=head.next;
		} else bucketList.set(index,  head.next);
		
		return head.value;
	}
	
	//returns the current size of the hash bucket
	public int size() {
		return size;
	}
	
	private class Node<nK, nV> {
		nK key;
		nV value;
		Node<nK,nV> next;
		private Node(nK key, nV value) {
			this.key=key;
			this.value=value;
		}
	}
}
