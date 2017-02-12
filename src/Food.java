public class Food 
{
	private int nutrition;
	private int quantity;
	private int weight;
	private String name;
	
	public void setNutrition()
	{
	this.nutrition = nutrition;
	}
	/*Accessor that retrieves the 
	 * number of nutrition from the mutator 
	 */
	public int nutrition()
	{
		return nutrition;
	}
	
	public int quantity()
	{
		return quantity;
	}
	/*
	 * Mutator sets the the quantity of food
	 * 
	 */
	public void setQuantity(int newQuantity)
	{
		
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
	/*
	 * Prints the Accessor of the name, the weight, nutrition, and quantity
	 */
	public void examine()
	{
		System.out.print("This will replenish your health.\n"
				+ "Food: " + name + 
				"\n" + "Weight: " + weight 
				+ "\n" + "Nutrition: " + nutrition
				+ "\n" + "Quantity: " + quantity);
	}
}
