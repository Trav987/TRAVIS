package H4;

public class Stacks 
{
	Node current;
	
	public void push(String x)
	{
		Node newNode = new Node(x);
		
		if(current == null)
		{
			current = newNode;
		}
		else
		{
			current = newNode.getPrev();
			current = newNode;
			
			
			//push(new String());
			
		}
		
		System.out.println("Push(" + x + ")");
		
	}
	
	public String pop()
	{
		if(current == null)
		{
			System.out.println(" ");
			return null;
		}
		else
		{
			String temp = current.getName();
			while(current.getPrev()!= null)
			{
			current = current.getPrev();
			}
			//System.out.println("Pop: " + temp);
			return temp;
					
		}
		
	}

	
}
