package second;



public class main 
{
	public static void main(String [] args)
	{
		link dl = new link();
		
		
		dl.insert("Bob");
		dl.insert("Amy");
		dl.insert("Will");
		dl.insert("Ted");
		dl.insert("Dee");
		dl.print();
		
		//dl.iterate();
		dl.remove();
		dl.remove();
		dl.print();
		
		//dl.findNode("Bob");
		//dl.findNode("Ted");
		//dl.findNode("Bill");
		
			
	
		
		/*if(dl.findNode("Al").getName())
		{
			System.out.print("Here.");
		}*/
		
	
		
		
		
	
		
	}
}
