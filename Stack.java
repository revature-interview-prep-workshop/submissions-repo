import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Object> list = new ArrayList<>();
    public Stack ()
    {
        super();
    }

    public void push(Object data)
    {
       
        list.add(0, data);
    }

    public Object remove()
    {
        return list.remove(0);
    }

    public Object peek()
    {
        return list.get(0);
    }

    public void print()
    {
        for (int i =0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println("");
    }
    public static void main (String[]args)
    {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.print();

        System.out.println(s.peek());
        System.out.println(s.remove());

        s.print();

    }
}
