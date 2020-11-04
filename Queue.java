import java.util.ArrayList;
import java.util.List;

public class Queue{
    List<Object> list = new ArrayList<>();
    public Queue ()
    {
        super();
    }

    public void add(Object data)
    {
       
        list.add(data);
    }

    public Object pop()
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
        Queue s = new Queue();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        s.print();

        System.out.println(s.peek());
        System.out.println(s.pop());

        s.print();

    }
}
