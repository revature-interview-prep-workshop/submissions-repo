import java.util.LinkedList;
import java.util.Iterator;

public class Queue<T> {

    private LinkedList<T> list;
 
    public Queue() {
        this.list = new LinkedList<T>();
    }
    public boolean enqueue(T element) {
        list.add(element);
        return true;
    }
 
    public T dequeue() {
        Iterator<T> iter = list.iterator();
        T element = iter.next();
        if(element != null){
            iter.remove();
            return element;
        }
        return null;
    }

    public T peek() {
        return list.getFirst();
    }
  }