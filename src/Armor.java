public class Armor
{
	private String name;
	private int defense;
	private int weight;
	
	public int getDefense()
	{
		return defense;
	}
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
		System.out.print("Name: " + name + 
				"\n" + "Weight: " + weight 
				+ "\n" + "Defense: " + defense);
	}
}
