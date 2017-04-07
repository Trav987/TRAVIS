package H4;

public class Queues 
{
Node current;
	
	public void enqueue(String x)
	{
		Node newNode = new Node(x);
		
		if(current == null)
		{
			current = newNode;
		}
		else
		{
			Node temp = current;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
				newNode = temp.getNext();
		}
	}
	
	public String dequeue()
	{
		if(current == null)
		{
			System.out.println(" ");
			return null;
		}
		else
		{
			String temp = current.getName();
			current = current.getNext();
			return temp;
					
		}
	}
}
