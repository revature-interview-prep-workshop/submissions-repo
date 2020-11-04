import org.example.objects.LinkedList;
import org.example.objects.Stack;

public class Driver {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        linkedList.add(1, 50);




        //This isnt the prettiest and could be cleaned but this aspect of the implementation I
        // feel is irrelevant, I could probably hide it and put it in the LinkedList class but that
        // wouldnt really make sense.
        LinkedList.Node<Integer> temp_head = linkedList.head;
        while(temp_head != null) {
            System.out.println(temp_head.nodeData);
            temp_head = temp_head.next;
        }

        System.out.println(linkedList.contains(50));
        System.out.println(linkedList.contains(60));


        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);

        Stack.StackNode<Integer> temp_stack_head = stack.head;

        while(temp_stack_head != null) {
            System.out.println(temp_stack_head.nodeData);
            temp_stack_head = temp_stack_head.next;
        }
    }
}
