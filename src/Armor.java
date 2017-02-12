public class Armor
{
	private String name;
	private int defense;
	private int weight;
	
	public void setDefense()
	{
		this.defense = defense;
	}
	/*
	 * Accessor that retrieve the amount of 
	 * defense the armor has from the mutator
	 */
	public int getDefense()
	{
		return defense;
	}
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
	 * Prints the Accessor of the name, the weight, defense
	 */
	public void examine()
	{
		System.out.print("This will protect you against attacks.\n"
				+ "Armor: " + name + 
				"\n" + "Weight: " + weight 
				+ "\n" + "Defense: " + defense);
	}
}
