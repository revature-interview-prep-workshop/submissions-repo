package com.revature.hashTable;

import java.util.ArrayList;

public class HashTable<K, V> {

    private ArrayList<HashNode<K, V>> chainArray;

    private int numbChains;

    private int size;

    public HashTable() {

        chainArray = new ArrayList<>();
        numbChains = 10;
        size = 0;

        for (int i = 0; i < numbChains; i++)
            chainArray.add(null);
    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() { return getSize() == 0; }


    private int getBucketIndex(K key)
    {
        int hashCode = key.hashCode();
        int index = hashCode % numbChains;
        return index;
    }

    public V get(K key) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        return null;
    }

    public void add(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray.get(bucketIndex);

        while (head != null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = chainArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        chainArray.set(bucketIndex, newNode);


        if ((1.0*size)/numbChains >= 0.7) {
            ArrayList<HashNode<K, V>> temp = chainArray;
            chainArray = new ArrayList<>();
            numbChains = 2 * numbChains;
            size = 0;
            for (int i = 0; i < numbChains; i++)
                chainArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove(K key) {

        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = chainArray.get(bucketIndex);

        HashNode<K, V> prev = null;
        while (head != null)
        {
            if (head.key.equals(key)) {
                break;
            }

            prev = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        size--;

        if (prev != null) {
            prev.next = head.next;
        } else {
            chainArray.set(bucketIndex, head.next);
        }

        return head.value;
    }


}
