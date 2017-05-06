package HW6;


public class BSTNode
{
	  BSTNode left, right;
	    String data;
	 

	    public BSTNode()
	    {
	        left = null;
	        right = null;
	        data = null;
	    }

	    public BSTNode(String n)
	    {
	        left = null;
	        right = null;
	        data = n;
	    }

	    public void setLeft(BSTNode n)
	    {
	        left = n;
	    }

	    public void setRight(BSTNode n)
	    {
	        right = n;
	    }

	    public BSTNode getLeft()
	    {
	        return left;
	    }

	    public BSTNode getRight()
	    {
	        return right;
	    }

	    public void setData(String d)
	    {
	        data = d;
	    }

	    public String getData()
	    {
	        return data;
	    }     

}
