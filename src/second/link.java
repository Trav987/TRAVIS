package second;



public class link 
{
	private int size = 0;
	private Node root;
	private Node tail;
	/*
     * It has to take a new Node and add that to the beginning of the linked list.
     * If the list is empty, assign it as the "root" or "tail". 
     * @Param - Node
     */
	public link()
	{
		this.root = null;
		this.tail = null;
	}
	/*
	 * Increments the size
	 */
	public int getSize()
	{
		
		return this.size;
	}
	
	/*
	 * Boolean statement to dictate, 
	 * whether the root is there or not
	 */
	public boolean isEmpty()
	{
		return root == null;
	}
	
	/*
	 * Void method for printing the list
	 */
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
	
	
	/*
	 * It takes the Node and puts the node in alphabetical order
	 * 
	 * @return void - if the list is Empty throw exception
	 */
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
			//sets root to temp
			Node temp = this.root;
			//sets newNode to root
			root = newNode;
			//calls for the next root to the temp
			root.setNext(temp);
			//sets the previous root name to temp
			temp.setPrev(root);
			
		}
		else if(newNode.getName().compareTo(tail.getName()) > 0)
		{
			//sets root to tail
			Node temp = this.tail;
			//sets newNode to tail
			tail = newNode;
			//calls for the previous tail to be set to temp
			tail.setPrev(temp);
			//calls for the next temp to be set to tail
			temp.setNext(tail);
			
		}
		else 
		{
			//Determines how the string will fall into the middle of the list
			Node temp = this.root;
			while(newNode.getName().compareTo(temp.getNext().getName()) >= 0)
			{
				
				temp = temp.getNext();
			}
			//Sets the newNode next to the next temp node
			newNode.setNext(temp.getNext());
			//the NewNode is set to the previous temp node
			newNode.setPrev(temp);
			//sets the previous next temp to the newNode 
			temp.getNext().setPrev(newNode);
			//sets the temp to the next newNode
			temp.setNext(newNode);
		}
		
	this.size++;
	}
	
	/*
	 * This method finds any listed Node 
	 * within the list
	 * 
	 */
	 public void findNode(String n)
	 {
	        if( n == null) 
	        {
	        	
	        	throw new RuntimeException("The list is empty.");
	        	
	        }
	        Node temp = root;
	        while(temp.getName() != n)
	        {     
	        	temp = temp.getNext();
	        	
	            if(temp == null)
	            {
	            	System.out.println("The name " + n + " doesn't exist.");
	            	return;
	            }
	        }
	        System.out.println("The name " + n +" exist ");
	    }
	 
	 /*
	  * Removes a Node from the beginning of the list
	  */
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
	 
	 /*
	  * It takes the Node and prints it backwards
	  */
	 public void back()
	 {
		
		 if(root == null)
		 {
			 throw new RuntimeException("The list is empty.");
		 }
		 
		 else 
		 {
			 Node newNode = root;
			 
			 root = tail;
			 
			 tail = newNode;
			
			System.out.println(root.getName());
			 
				 while( root != tail)
				 {
				
					 root = root.getPrev();
					 System.out.println(root.getName()); 
				 }
			 
			
			 
		 }
		 this.size++;
	
	 }
	 /*
	  * Completely destroys the list from their memory 
	  */
	 public void deleteList()
	 {
		 if(root == null)
		   	{
		   		throw new RuntimeException("The list is empty.");
		   	}
	    	else
	    	{		
	    		while(root != null)
	    		{
	    			root = root.getNext();
	    			//System.out.println("Node is gone!");
	    		}
	    		
	    	}
		    this.size--; 
	 }
	 
	
	
	
	
}
