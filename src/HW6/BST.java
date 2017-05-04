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
    
    public void setRoot(int data){
        root = new BSTNode(data);
    }
    
    public BSTNode getRoot(){
        return root;
    }

    public void insert(int data)
    {
       insert(root, data);
    }

    private void insert(BSTNode node, int data)
    {
       //Implement This Function!!!!!!
    	if(data <= node.getData())
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
    	else if(data > node.getData())
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
}
