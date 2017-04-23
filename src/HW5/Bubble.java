package HW5;

import java.lang.reflect.Array;

public class Bubble 
{
	 public static void main(String[] args) 
	 {
		 int[] array = {8,4,-2,5,6,10,120};
	        
	        System.out.println("The Unsorted List:");
	        for(int i = 0; i < array.length; i++)
	        {
	            System.out.print(array[i]);
	            if(i != (array.length-1))
	                System.out.print(", ");
	        }
	        
	        System.out.println("");
	        System.out.println("");
	        
	        array = sortLoop(array);
	        System.out.println("The Sorted List:");
	        for(int i = 0; i < array.length; i++)
	        {
	            System.out.print(array[i]);
	            if(i != (array.length-1))
	                System.out.print(", ");
	        }
	       	        
	     
	      
	     
	 }
	public static int[] sortLoop(int[] x)
	{
		boolean swapOcurred = true;
		while(swapOcurred)
        {
        	swapOcurred = false;
		for(int i = 0; i < x.length - 2; i++)
		{
			if (x[i] > x[i+1])
			{
				int temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
				swapOcurred = true;
			}
		}
        }
		return x;
	}
}
