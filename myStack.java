import java.util.*;

public class myStack{

private int maxSize;
private int[] stackArray;
private int top;

public myStack(int s){
	maxSize=s;
	stackArray=new int[maxSize];
	top=-1;
}


public static void main(String[] args){
	myStack theStack=new myStack(5);
	theStack.push(1);
	theStack.push(2);
	theStack.push(3);
	theStack.dump();
	theStack.pop();
	theStack.dump();
}

public void push(int i){
	stackArray[++top]=i;
}
public int pop(){
	return stackArray[top--];
}
public int peek(){
	return stackArray[top];
}
public boolean isEmpty(){
	return(top==-1);
}
public boolean isFull(){
	return (top==maxSize-1);
}
public void dump(){
	for(int i=0; i<stackArray.length; i++){
		System.out.println(stackArray[i]);
	}

}
}
