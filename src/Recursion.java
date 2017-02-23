
public class Recursion {
	
	/*public static int rangeSum(int [] array, int start, int end)
	{
		if (start > end)
			return 0;
		else
			return array[start] + rangeSum(array, start + 1, end);
	}
	public static void main(String[] args)
	{
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum;
		sum = rangeSum(numbers, 3, 7);
		System.out.println(sum);
	}*/
	
	public static int recursive (int a)
	{
		if(a==0)
			return 1;
		return 3*recursive(a-1);
		
	}
	public static void main(String [] args)
	{
		System.out.print(recursive(4));
	}
	
	
	
	/*	
	public static void printSomething(int x){
		 if ( x<1){
		 System.out.println(x);
		 return;
		}
		 System.out.println (x);
		 printSomething (x - 1);
		 }
		public static void main ( String [] args )
		{
		 printSomething (4);
		 }
		 */
}
