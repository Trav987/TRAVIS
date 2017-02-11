public class Item 
{
	private String name; 
	private int weight;
	
	
	public String getName()
	{
		
		return name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	public void examine()
	{
		System.out.print("Item: " + getName()+ "\n" + "Weight: " + getWeight());
	}
	
	
}
