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
		 //sets the next name
		 public Node getNext() 
		 {
		  return next;
		 }

		 public void setNext(Node t) 
		 {
		  this.next = t;
		 }
		 
		 //sets previous name
		 public Node getPrev()
		 {
			 return prev;
		 }
		 public void setPrev(Node p)
		 {
			 this.prev = p;
		 }
		 //sets the current name
		 public String getName()
		 {
		  return name;
		 }

		 public void setName(String n) 
		 {
		  this.name = n;
		 }
		 //prints the name
		public void print() 
		{
			System.out.print(this.name + " ");
			
		}
}
