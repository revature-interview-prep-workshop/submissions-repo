import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MianClass {

    public static void main(String[] args) {

     MyLinkedList<String> test1 = new MyLinkedList<>();

     test1.insert("first");
     test1.printList();

//        System.out.println(2%5);
//
//
//        int [] testArr = {1,2,3,4,5};
//
//        for (int i:ArrayTesting.rotleft(testArr,4)){
//            System.out.print(i);
//        }


        Queue<String> qq = new ArrayDeque<>();
        qq.add("a");
        qq.add("b");
        qq.add("c");

        System.out.println(qq.peek());
        qq.remove();



        for(String s:qq){
            System.out.println("----"+s);
        }

        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }

    }






