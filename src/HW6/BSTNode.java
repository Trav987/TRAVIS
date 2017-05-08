package HW6;


public class BSTNode
{
	  BSTNode left, right;
	  String data, str;
	  int freq;

	    public BSTNode()
	    {
	        left = null;
	        right = null;
	        data = null;
	        str = null;
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
	    public void setString(String s)
	    {
	    	str = s;
	    }
	    public String getString()
        {
            return str;
        }
	    public void upFreq()
	    {
	    	freq = freq + 1;
	    }
	    public int getFreq()
	    {
	    	return freq;
	    }
	    public static int countNodes( BSTNode root ) {
	        if ( root == null ){
	            // The tree is empty.  It contains no nodes.
	            return 0;  
	                }else {
	            // Start by counting the root.
	            int count = 1;   
	            // Add the number of nodes in the left subtree.
	            count += countNodes(root.left);
	            // Add the number of nodes in the right subtree.
	            count += countNodes(root.right); 
	            return count;  // Return the total.
	        }
	    }

}
