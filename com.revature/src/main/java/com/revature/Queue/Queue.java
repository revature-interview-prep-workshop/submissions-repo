package com.revature.Queue;

class Queue 
{
    private int arr[];         
    private int frontValue;     
    private int rearValue;      
    private int capacity;       
    private int count;          
    
    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        frontValue = 0;
        rearValue = -1;
        count = 0;
    }
 
    public void dequeue()
    {
        if (!isEmpty())
        {
        frontValue = (frontValue + 1) % capacity;
        count--;
        }
    }

    public void enqueue(int data)
    {
        if (!isFull())
        {
        rearValue = (rearValue + 1) % capacity;
        arr[rearValue] = data;
        count++;
        }
    }
    public int size()
    {
        return count;
    }
 
    public Boolean isEmpty()
    {
        if(size() == 0){
            return true;
        } else {
            return false;
        }
    }
 
    public Boolean isFull()
    {
        if(capacity == 0){
            return true;
        } else {
            return false;
        }
    }
}