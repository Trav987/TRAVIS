import java.lang.reflect.Array;

public class Bubble 
{
	public void sortLoop(int x[])
	{
		for(int i = 0; i < x[i].length() - 2; i++)
		{
			if (x[i] > x[i+1])
			{
				int temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
				
			}
		}
	}
}
