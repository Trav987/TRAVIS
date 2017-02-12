public class Game
{
	public static void main(String [] args)
	{
		Item item = new Item();
		item.setName();
		item.setWeight();
		item.examine();
		
		System.out.println();
		System.out.println();
		
		Weapon weapon = new Weapon();
		weapon.setName();
		weapon.setWeight();
		weapon.setDamage();
		weapon.examine();
		
		System.out.println();
		System.out.println();
		
		Armor armor = new Armor();
		armor.setDefense();
		armor.setName();
		armor.setWeight();
		armor.examine();
		
		System.out.println();
		System.out.println();
		
		Food food = new Food();
		food.setName();
		food.setName();
		food.setNutrition();
		food.setQuantity(0);
		food.examine();
	}
}
