package second;

public class link 
{
	private int size = 0;
	private Node root = null;
	private Node tail = null;
	
	public link()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		if(root == null)
			return false;
		else
			return true;
	}
	
	public void addAtStart(String n)
	{
		System.out.println("This is letter: " + n );
		Node np = new Node(n, null, null);
		if (root == null)
		{
			root = np;
			tail = root;
		}
		else
		{
			root.setPrev(np);
			np.setNext(root);
			root = np;
		}
		if(isEmpty())
		{
			root = np;
		
		}
		
			size++;

	}
	/*public Node addAtEnd(String data)
	{
		System.out.println("This is letter: " + data + "End" );
		Node n = new Node(data);
		if(size == 0)
		{
			root = n;
			tail = n;
		}
		else
		{
			tail.getNext() = n;
			n.getPrev() = tail;
			tail = n;
		}
		size++
		return n;
	}*/
	
	public int getSize()
	{
		return size;
	}
}
