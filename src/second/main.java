package second;

public class main 
{
	public static void main(String[] args)
	{
		link dl = new link();
		dl.addAtStart("A");
		dl.addAtStart("B");
		dl.addAtStart(0, "C");
		dl.addAtStart(2, "D");
		dl.addAtStart(4,"link");
		
		System.out.println(dl);
	}
}
