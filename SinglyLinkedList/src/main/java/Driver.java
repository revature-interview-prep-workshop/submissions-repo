import org.example.objects.LinkedList;

public class Driver {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        //This isnt the prettiest and could be cleaned but this aspect of the implementation I
        // feel is irrelevant, I could probably hide it and put it in the LinkedList class but that
        // wouldnt really make sense.
        LinkedList.Node temp_head = linkedList.head;
        while(temp_head != null) {
            System.out.println(temp_head.nodeData);
            temp_head = temp_head.next;
        }
    }
}
