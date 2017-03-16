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
	        tmp = tmp.getNext();
	      }
	      
	      System.out.println(" ");
	    }
	  }
	
	public void add(String n)
	{
		//System.out.println("This is: " + n );
		//Node t = new Node(n, null, null);
		if (isEmpty())
		{
			tail = new Node(n);
			root = tail;
		}
		else
		{	
			tail = new Node(n,null, tail);
			tail.setNext(tail);
			tail = tail.getNext();
			//.out.println(tail);
		}
		this.size++;
	}
	public void add(int index, String n)
	{
		
		Node temp = new Node(n);
		if(index < 0||index > this.getSize())
		{
			System.out.println("This index " + index + " does not exisit");
		}
		
		else if(this.isEmpty())
		{
			this.root = temp;
		}
		
		if(index == 0)
		{
			//System.out.println(root);
			Node head = root;
			root = new Node(n, head, null);
			if(head != null)
				head.setPrev(root.getNext());
			if(tail == null)
				this.tail = root;
			return;
		}
		/*else if(index == this.getSize())
		{
			//System.out.println(root);
			Node current = this.root;
			while(root.getNext() != null)
			{
			current = current.getNext();
			}
			current.setNext(root);
			}*/
		else{
			
				Node current = this.root;
				for(int i = 1; i< index - 1; i++)
				{
					root = current.getNext();
					System.out.println(root);
				}
				
				Node succ = current.getNext();
				Node middle = new Node(n, succ, current);
				middle.setPrev(current.getNext());
				//System.out.println(tail);
				if(succ == null)
					tail = middle;
				else
					middle.setNext(succ.getNext());
				
				/*root.setNext(curr.getNext());
				curr.setNext(root);*/
			
			}

		this.size++;
	
	}
	
	
	
}
