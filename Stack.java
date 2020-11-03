import java.util.*;

public class Stack {

private ArrayList<Integer> contents= new ArrayList<Integer>();




public static void main(String[]args) {
	Stack arr=contents();
	arr.push(4);
	arr.push(5);
	arr.push(6);
	arr.pop();
	arr.dump();



}

public void push(int i){
	arr.add(i);
}

public void pop(){
	arr.remove(0);
}

public void dump(){
	for (int a=0; a<arr.length;a++){
		System.out.println(arr[a]);
		}
	}
}