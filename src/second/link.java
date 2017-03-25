package second;

import lab05.Node1;

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
	
	 public boolean findNode(Node node)
	 {
		 //Node currentNode = new Node(n);
		
	        if( node == null) 
	        {
	        	System.out.println(node);
	        	System.out.println("Null");
	        	return false;
	        }
	        Node currentNode = root;
	        while(currentNode.getNext() != node)
	        {
	            currentNode = currentNode.getNext();
	            if(currentNode == null)
	            {
	            	System.out.print("Doesn't exist.");
	            }
	            return false;
	            
	        }
	        System.out.println("Exist." + node);
	        return true;
	    }
	
	
	
	
}
