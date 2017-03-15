package second;


public class Node
{
	private Node next;
	private Node prev;
	private String name = "";

	
		public Node(String n, Node t, Node p) 
		{
			name = n;
			next = t;
			prev = p;
		}
		public Node(String n)
		{
			this(n, null, null);
		}
		 
		 public Node getNext() 
		 {
		  return next;
		 }

		 public void setNext(Node t) 
		 {
		  this.next = t;
		 }
		 public Node getPrev()
		 {
			 return prev;
		 }
		 public void setPrev(Node p)
		 {
			 this.prev = p;
		 }
		 public String getName()
		 {
		  return name;
		 }

		 public void setName(String n) 
		 {
		  this.name = n;
		 }
}
