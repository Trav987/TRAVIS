public class Game
{
	public static void main(String [] args)
	{
		Item item = new Item();
		item.setName();
		item.examine();
		
		System.out.println();
		System.out.println();
		
		Weapon weapon = new Weapon();
		weapon.examine();
		
		System.out.println();
		System.out.println();
		
		Armor armor = new Armor();
		armor.examine();
	}
}
