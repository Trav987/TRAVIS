public class Weapon
{
	private int damage;
	private String name;
	private int weight;
	
	public int getDamage()
	{
		return damage;
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
		System.out.println("Name: " + name + 
				"\n" + "Weight: " + weight 
				+ "\n" + "Damage: " + damage);
	}
}





