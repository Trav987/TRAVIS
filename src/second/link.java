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
	
	
	
	public void insert(String n)
	{
		
		Node newNode = new Node(n);
		if(isEmpty())
		{
			root = newNode;
			tail = newNode;
		}
		else if(newNode.getName().compareTo(root.getName()) < 0)
		{
			Node temp = this.root;
			root = newNode;
			root.setNext(temp);
			temp.setPrev(root);
			//System.out.println(n);
		}
		else if(newNode.getName().compareTo(tail.getName()) > 0)
		{
			
			Node temp = this.tail;
			tail = newNode;
			tail.setPrev(temp);
			temp.setNext(tail);
		}
		else //if(newNode.getName().compareTo(root.getName()) > 0 && newNode.getName().compareTo(tail.getName()) < 0)
		{
			Node temp = this.root;
			while(newNode.getName().compareTo(temp.getNext().getName()) >= 0)
			{
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
		}
		
	this.size++;
	}
	
	 public void findNode(String n)
	 {
	        if( n == null) 
	        {
	        	
	        	System.out.println("Is null");
	        	
	        }
	        Node temp = root;
	        while(temp.getName() != n)
	        {     
	        	temp = temp.getNext();
	        	
	            if(temp == null)
	            {
	            	System.out.println("The name " + n + " doesn't exist.");
	            }
	        }
	        System.out.println("The name " + n +" exist ");
	    }
	 
	 public void remove()
	 {
		   
		   	if(root == null)
		   	{
		   		throw new RuntimeException("The list is empty.");
		   	}
	    	else
	    	{		
	    		root = root.getNext();
	    	}
		    this.size--;
		    
	 }
	 
	
	
	
	
}
