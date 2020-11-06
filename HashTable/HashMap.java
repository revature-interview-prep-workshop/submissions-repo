import java.util.*;

class HashMap<K, V> {

private ArrayList<HashNode<K, V>> hashArray;

private int numHash;

private int size;

public HashMap(){
	hashArray=new ArrayList<>();
	numHash=10;
	size=0;
		for (int i = 0; i<numHash; i++)
		{
		hashArray.add(null);
		}
}

public static void main(String[] args)
{
	HashMap<String, Integer>map = new HashMap<>();
	map.add("hello",1);
	map.add("world",2);
	map.add("from",3);
	map.add("Jesse",4);
	System.out.println(map.size());
	System.out.println(map.remove("world"));
	System.out.println(map.size());
	System.out.println(map.isEmpty());
}



	public int size() {return size;}
	public boolean isEmpty() {return size()==0;}

	private int getIndex(K key)
	{
		int hashCode= key.hashCode();
		int index = hashCode % numHash;
		return index;
	}

	public V remove(K key)
	{
		int bIndex=getIndex(key);
		HashNode<K, V> head= hashArray.get(bIndex);

		HashNode<K, V> prev=null;
		while(head !=null)
		{ if(head.key.equals(key))
		break;

		prev=head;
		head=head.next;
	}

	if (head == null)
	return null;

	size--;

	if(prev !=null)
	prev.next=head.next;
	else
	hashArray.set(bIndex, head.next);

	return head.value;
}

public V get(K key)
{
	int bIndex=getIndex(key);
	HashNode<K, V> head = hashArray.get(bIndex);

	while (head !=null)
	{
		if(head.key.equals(key))
		return head.value;
		head = head.next;
	}
	return null;
}

public void add (K key, V value)
{
	int bIndex = getIndex(key);
	HashNode<K, V> head = hashArray.get(bIndex);

	while(head !=null)
	{
		if(head.key.equals(key))
		{ head.value=value;
		return;
	}
	head=head.next;
}

size++;
head=hashArray.get(bIndex);
HashNode<K, V> newNode= new HashNode<K, V>(key, value);
newNode.next=head;
hashArray.set(bIndex, newNode);

if((1.0*size)/numHash>=0.7)
{
	ArrayList<HashNode<K, V>> temp = hashArray;
	hashArray= new ArrayList<>();
	numHash=2 * numHash;
	size=0;
	for(int i=0; i<numHash;i++)
	hashArray.add(null);

	for(HashNode<K, V> headNode : temp)
	{
		while (headNode != null)
		{
			add(headNode.key, headNode.value);
			headNode = headNode.next;
				}
			}
		}
	}
}
