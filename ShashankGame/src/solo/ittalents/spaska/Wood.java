package solo.ittalents.spaska;

import java.util.ArrayList;

import solo.ittalents.enemies.BasicEnemy;

public class Wood {

	private ArrayList<BasicEnemy> creeps;
	
	public Wood(){
		this.creeps = createEnemies();
	}
	
	public ArrayList<BasicEnemy> getCreeps() {
		return creeps;
	}

	private ArrayList<BasicEnemy> createEnemies(){
		
		ArrayList<BasicEnemy> enemies = new ArrayList<>();
		enemies.add(new BasicEnemy("Ogre", 2, 50));
		enemies.add(new BasicEnemy("Troll", 3, 30));
		enemies.add(new BasicEnemy("Dragon", 8, 100));
		enemies.add(new BasicEnemy("Hunter", 4, 40));
		enemies.add(new BasicEnemy("Titan", 3, 200));
		
		return enemies;
		
	}
	
}
