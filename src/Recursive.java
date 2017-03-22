
public class Recursive 
{
	
	//Constructor used for finding the square root
	public static double recursive(double x)
	{ 
		//recursive if statement that inputs the given number
		
		if (x==0)
			 return 1;
		return 0.5*(recursive(x-1) + x/recursive(x-1));
		
		
	}
	//Main method argument that gives the program its value
	public static void main (String [] args)
	{
		
		System.out.print(recursive(30));
		
	}

}
