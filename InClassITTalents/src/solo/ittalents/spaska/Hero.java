package solo.ittalents.spaska;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import solo.ittalents.enemies.Enemy;

public class Hero {
	
	String name;
	private int currentHealth;
	private int health;
	private int damage;
	private HashMap<String, Item> items;
	private boolean isAlive = true;
	
	
	public Hero(String name){
		this.name = name;
		this.health = 70;
		this.currentHealth = this.health;
		this.damage = 8;
		this.items = new HashMap<>();
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public int getCurrentHealth() {
		return currentHealth;
	}


	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return this.health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public HashMap<String, Item> getItems() {
		return items;
	}
	
	public void fight(Enemy enemy){
		Scanner scan = new Scanner(System.in);
		while (this.currentHealth > enemy.getDamage()) {
			if (new Random().nextBoolean()) {
				this.hit(enemy);
			}
			else {
				enemy.hit(this);
			}
			if (enemy.getHealth() <= 0) {
				
				System.out.println(enemy.getName() + " is dead.\n" + "The enemy droped " + enemy.getItem().getName());	
				enemy.setAlive(false);
				System.out.println("----------------------------------------");
				System.out.println("Do you like to inspect this item?  Y/N");
				
				System.out.println("----------------------------------------");
				String inspect = scan.nextLine();
				System.out.println("----------------------------------------");
				
				if (inspect.equals("Y")) {
					lookAtTheItem(enemy.getItem());
					System.out.println("----------------------------------------");
					System.out.println("Do you like to wear this item? Y/N");
					String wearItem = scan.nextLine();
					if (wearItem.equals("Y")) {
						takeItem(enemy.getItem());
						System.out.println("----------------------------------------");
						System.out.printf("Now you are wearing %n" + enemy.getItem());
						isWearingShashank();
						System.out.println("----------------------------------------");
					}
				}
					break;		
			}		
		}		
	}
	
	private void takeItem(Item item){
		
		if (!this.items.containsKey(item.getType())) {
			this.items.put(item.getType(), item);
		}
		else {
			this.items.remove(item.getType());
			this.items.put(item.getType(), item);
		}
	}
	
	private void lookAtTheItem(Item item){
		System.out.println("Type: " + item.getType());
		System.out.println("Name: " + item.getName());
		System.out.println("Bonus Damage: " + item.getIncreaseDamage());
		System.out.println("Bonus Helath: " + item.getIncreaseHealth());
		
	}
	
	private void hit(Enemy enemy){
		enemy.setHealth(enemy.getHealth() - this.damage);
	}
	
	//print hero stats
	@Override
	public String toString() {
		return String.format("Hero Health: %d%nHero Damage: %d", this.getHealth(), this.getDamage());
				
	}
	//print items 
	public void printItems(){
		int counter = 0; 
		for (Map.Entry<String,Item> entry : items.entrySet()) {
			
			  String key = entry.getKey();
			  String value = entry.getValue().getName();	
				System.out.println("The hero have no items.");
			
				  System.out.printf(key + " - " + value + "%n");
				  counter++;
			  
		}
		if (counter == 0) {
			System.out.println("The hero have no items.");
		}
	}
	
	public void isWearingShashank(){
		
		String[] wearingItems = new String[4];
		int counter = 0;
		boolean isSet = false;
		
		for (Map.Entry<String,Item> entry : items.entrySet()) {
			
			  String value = entry.getValue().getName();
			  wearingItems[counter] = value;
			  counter++;			  
		}
		for (int i = 0; i < wearingItems.length; i++) {
			if(wearingItems[i] == null){
				isSet = false;
				break;
			}
			if (wearingItems[i].equals("Shashank")) {
				isSet = true;
			}
			else {
				isSet = false;
				break;
			}
		}
		if (isSet) {
			System.out.println("YOU ARE NOW WEARING THE LEGENDARY SHAHSANK SET!");
			this.setHealth(this.getHealth() + 100);
			this.setDamage(this.getDamage() + 100);
		}
	}
}
