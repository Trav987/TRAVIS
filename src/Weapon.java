public class Weapon 
{
	private int damage;
	private String name;
	private int weight;
	
	public void setDamage()
	{
		this.damage = damage;
	}
	/*Accessor that retrieves the number of damage done by 
	 * the weapon from the mutator
	 */
	public int getDamage()
	{
		return damage;
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
	 * Prints the Accessor of the name, the weight, and damage
	 */
	public void examine()
	{	
		System.out.println("Used this to attack enemy.\n" + 
				"Weapon: " + name + 
				"\n" + "Weight: " + weight 
				+ "\n" + "Damage: " + damage); 
	}
}





