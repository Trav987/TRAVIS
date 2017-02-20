
public class Recursive 
{
	public static double recursive(double x)
	{
		if(x==0)
			return 1;
		return 0.5*(recursive(x-1)+ x/recursive(x-1));
	
	}
	public static void main (String [] args)
	{
		System.out.print(recursive(25));
	}
}
