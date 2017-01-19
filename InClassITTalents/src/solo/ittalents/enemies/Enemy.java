package solo.ittalents.enemies;

import java.util.ArrayList;
import java.util.Collections;

import solo.ittalents.spaska.Hero;
import solo.ittalents.spaska.Item;

public class Enemy {
	
	private String name;
	private int damage;
	private int health;
	private Item item;
	private boolean isAlive = true;
	
	
	public Enemy(String name, int damage, int healt){
		this.name = name;
		this.damage = damage;
		this.health = healt;
		this.item = giveItem();
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public Item getItem() {
		return item;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}
	
	public void hit(Hero hero){
		hero.setCurrentHealth(hero.getCurrentHealth() - this.damage);
	}
	
	private Item giveItem(){
		
		ArrayList<Item> items = new ArrayList<>();

		//swords
		items.add(new Item("Shashank", "Sword", 5, 24));
		items.add(new Item("Normal Sword", "Sword", 0, 6));
		items.add(new Item("The Butcher", "Sword", 2, 16));
		items.add(new Item("The Needle", "Sword", 1, 18));
		//helms
		items.add(new Item("Shashank", "Helm", 24, 5));
		items.add(new Item("Normal Helm", "Helm", 10, 0));
		items.add(new Item("The Budcher", "Helm", 14, 2));
		items.add(new Item("Helm of Starks", "Helm", 18, 3));
		items.add(new Item("Helm of the beast", "Helm", 20, 3));
		//armors
		items.add(new Item("Shashank", "Armor", 28, 5));
		items.add(new Item("Normal Armor", "Armor", 12, 0));
		items.add(new Item("The Butcher", "Armor", 16, 2));
		items.add(new Item("Armor of Starks", "Armor", 20, 3));
		//shields
		items.add(new Item("Shashank", "Shield", 26, 8));
		items.add(new Item("Normal Shield", "Shield", 13, 2));
		items.add(new Item("The Budcher", "Shield", 16, 3));
		items.add(new Item("Shield of Starks", "Shield", 20, 5));
		
		Collections.shuffle(items);
		return items.get(0);
		
	}
	//Printing stats
	@Override
	public String toString() {
		return String.format("Name: %s%nDamage: %d%nHealth: %d%nItem: %s - %s%n",
				this.getName(),
				this.getDamage(),
				this.getHealth(),
				this.getItem().getName(),
				this.getItem().getType());
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
