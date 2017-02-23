
public class Recursive 
{
	
	public static double recursive(double x)
	{ 
		
		if (x==0)
			 return 1;
		return 0.5*(recursive(x-1) + x/recursive(x-1));
		//new
		
	 
		
	}
	
	public static void main (String [] args)
	{
		
		double error = 0;
		error = error/2;
		recursive(error);
		System.out.print(recursive(20));
		
		
	}
}
