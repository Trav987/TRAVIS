public class Item 
{
	private String name; 
	private int weight;
	
	public void setName()
	{
	this.name = name;
	}
	/*Accessor that retrieves the given name of 
	 * item by the mutator
	 */
	public String getName()
	{
		
		return name;
	}
	public void setWeight()
	{
		this.weight = weight;
	}
	/*Accessor of weight that retrieves the number of the given weight
	 * by the weight mutator
	 */
	public int getWeight()
	{
		return weight;
	}
	/*
	 * Prints the Accessor of the name and the weight
	 */
	public void examine()
	{
		System.out.print("This is an object. \n"
				+ "Item: " + getName()+ "\n" + "Weight: " + getWeight());
	}
	
	
}
