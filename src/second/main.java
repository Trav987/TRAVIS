package second;



public class main 
{
	public static void main(String [] args)
	{
		link dl = new link();
		
		System.out.println("This method prints forward, "
				+ "in alphabetical order:\n");
		
		dl.insert("Bob");
		dl.insert("Amy");
		dl.insert("Will");
		dl.insert("Ted");
		dl.insert("Dee");
		dl.print();
		
		System.out.println("This method prints backwards:\n");
		
		dl.back();
		
		System.out.println("");
		System.out.println("This method removes node:\n");
		
		dl.remove();
		dl.print();
		
		System.out.println("This method find node:\n");
		dl.findNode("Amy");
		dl.findNode("Ted");
		dl.findNode("Bill");
		
		System.out.println("\nThis method destroyed the list:\n");
		dl.deleteList();
		
		//dl.findNode("Dee");
		
	
		
		
		
	
		
	}
}
