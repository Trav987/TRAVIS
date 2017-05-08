package HW6;

import java.util.Scanner;
public class BST
{
	private  BSTNode root;
	
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
   public BSTNode search(BSTNode root, String id)
    {
    	if(root == null)
    	{
    		return null;
    	}
    	else if(id.equals(root.getString()))
    	{
    		return root;
    	}
    	else
    	{
    		if(root.getLeft() != null)
    			return search(root.getLeft(), id);
    		else
    			return search(root.getRight(), id);
    	}
    }
    

    public static void main(String[] args) {
        BST bstInstance = new BST();  
       bstInstance.setRoot("I");
      
       System.out.println("Building tree with root data");
      // bstInstance.insert("I");
       bstInstance.insert("have");
       bstInstance.insert("to");
       bstInstance.insert("go");
       bstInstance.insert("to");
       bstInstance.insert("the");
       bstInstance.insert("store");
       
        System.out.println("Traversing tree in order");
        bstInstance.inorder();
        
        
        System.out.println();
        
        if(bstInstance.search(root.getData(), " "))
       	{
        	
   		}
        
    }
}
