package second;

public class link 
{
	private int size = 0;
	private Node root;
	private Node tail;
	
	public link()
	{
		this.root = null;
		this.tail = null;
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
		//Node temp = new Node(n, null, null);
		if (isEmpty())
		{
			tail = new Node(n, null, null);
		}
		else
		{
			
			tail = tail.getNext();
		}
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
