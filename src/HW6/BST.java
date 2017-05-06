package HW6;


public class BST
{
	private BSTNode root;
	
	public BST()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void setRoot(String data)
    {
        root = new BSTNode(data);
    }
    
    public BSTNode getRoot()
    {
        return root;
    }

    public void insert(String data)
    {
       insert(root, data);
    }

    private void insert(BSTNode node, String data)
    {
       //Implement This Function!!!!!!
    	if(data.compareTo(node.getData()) < 0)
    	{
    		if(node.left != null)
    		{
    			insert(node.getLeft(), data);
    		}
    		else
    		{
    			node.left = new BSTNode(data);
    			
    		}
    	}
    	else //if(data != node.getData())
    	{
    		if(node.right != null)
    		{
    			insert(node.getRight(), data);
    		}
    		else
    		{
    			node.right = new BSTNode(data);
    			
    		}
    	}
    }
    public void inorder()
    {
        inorder(root);
    }
   
    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
          
            inorder(r.getRight());
        }
    }
   /* public void find(String id)
    {
    	BSTNode current = root;
    	while(current!=null)
    	{
    		if(current.getData()== id)
    		{
    			return;
    		}
    		else if(current.getData()>id)
    		{
    			current = current.getLeft();
    		}
    		else
    		{
    			current = current.getRight();
    		}
    		return false;
    	}
    }*/
    public static void main(String[] args) {
        BST bstInstance = new BST();  
        bstInstance.setRoot("This sentence repeats");
      
        System.out.println("Building tree with root data " + bstInstance.getRoot().getData());
      //  bstInstance.insert("This");
       // bstInstance.insert("sentence");
       // bstInstance.insert("repeats");
        //bstInstance.insert(3);
        //bstInstance.insert(9);
        //bstInstance.insert(12);
        //bstInstance.insert(11);
        //bstInstance.insert(15);
        System.out.println("Traversing tree in order");
        bstInstance.inorder();
        System.out.println();
        
    }
}
