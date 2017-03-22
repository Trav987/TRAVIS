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
	
	public int getSize()
	{
		
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void print() 
	{
	    if (this.isEmpty()) 
	    {
	      System.out.println("List is empty.");
	    }
	    else 
	    {
	      Node tmp = this.root;
	      while (tmp != null) 
	      {
	        tmp.print();
	        System.out.println();
	        tmp = tmp.getNext();
	      }
	      
	      System.out.println(" ");
	    }
	  }
	
	public void add(String n)
	{
		
		if (isEmpty())
		{
			tail = new Node(n);
			root = tail;
		}
		else
		{	
			
			root = new Node(n,root, null);
			
			while(tail != null)
			{
			root.setNext(tail);
			tail = tail.getNext();
			}
			
	
		}
		this.size++;
	}
	
	public void insert(String n)
	{
		Node str = new Node(n);
		if(isEmpty())
		{
			root = new Node(n);
			tail = new Node(n);
		}
		else if(str.getName().compareTo(root.getName()) < 0)
		{
			Node temp = root;
			root = str;
			root.setNext(temp);
			temp.setPrev(root);
		}
		else if(str.getName().compareTo(tail.getName()) > 0)
		{
			
			Node temp = tail;
			tail = str;
			tail.setPrev(temp);
			temp.setNext(tail);
		
		}
		else
		{
			
			Node temp = root;
			while(str.getName().compareTo(temp.getName()) < 0)
			{
				temp = temp.getNext();
			}
			str.setNext(temp.getNext());
			str.setPrev(temp);
			temp.setNext(str);
			str.setNext(str.getPrev());
			
		}
		
	
	}
	
	
	
	
}
