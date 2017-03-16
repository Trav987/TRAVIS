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
		if(root == null)
			return false;
		else
			return true;
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
	        tmp = tmp.getNext();
	      }
	      
	      System.out.println("");
	    }
	  }
	
	public void addAtStart(String n)
	{
		System.out.println("This is: " + n );
		//Node temp = new Node(n, null, null);
		if (isEmpty())
		{
			tail = new Node(n);
			root = tail;
		}
		else
		{
			tail = new Node(n,null, tail);
			tail = tail.getNext();
			
		}
		this.size++;
	}
	public void addAtStart(int index, String n)
	{
		System.out.println("This is: " + n );
		Node temp = new Node(n);
		if(index < 0||index > this.getSize())
		{
			System.out.println("Index " + index + " false");
		}
		else
		{
			if(this.isEmpty())
			{
				this.root = temp;
			}
			else if (index == 0)
			{
				Node prev = root;
				root = new Node(n, prev, null);
				if(prev != null)
					temp.setPrev(root);
				if(tail == null)
					this.tail = root;
				return;
			}
			else if(index == this.getSize())
			{
				Node curr = this.root;
				while(temp.getNext() != null)
				{
				curr = curr.getNext();
				}
				temp.setNext(root);
			}
			else
			{
				Node curr = this.root;
				for(int i =0; i< index -1; i++)
				{
					curr = curr.getNext();
				}
				root.setNext(curr.getNext());
				curr.setNext(root);
			}
		}
		this.size++;
	
	}
	
	
	
}
