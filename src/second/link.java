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
		Node temp = new Node(n, null, null);
		if (root == null)
		{
			root = temp;
			tail = root;
		}
		else
		{
			root.setPrev(temp);
			temp.setNext(root);
			root = temp;
		}
		if(isEmpty())
		{
			root = temp;
		
		}
		
			size++;
	}
	public void addAtEnd(String n)
	{
		System.out.println("This is letter: " + n + "End" );
		Node temp = new Node(n, null, null);
		if(size >= 0)
		{
			root = temp;
			tail = temp;
		}
		else
		{
			temp.setPrev(tail);
			tail.setNext(temp);
			tail = temp;
		}
		size++;
	
	}
	
	
	public int getSize()
	{
		return size;
	}
}
