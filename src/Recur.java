
public class Recur 
{
	public static int recur(int m, int x)
	{
		
		if (m<=0)
			return 1;
		return x * recur(m-1,x);
		
		
		/*return (int) Math.pow(m,x);
		return m;*/
		
		
	}
	public static void main(String[ ] args)
	{
		
		System.out.print(recur(2,5));
	}
}
