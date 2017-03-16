package second;

public class main 
{
	public static void main(String [] args)
	{
		link dl = new link();
		dl.add("Amy");
		dl.add("Bob");
		dl.add(0, "Al");
		//dl.add(2, "De");
		//dl.add(3,"Carol");
		
		dl.print();
	}
}
