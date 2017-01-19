package solo.ittalents.spaska;

import solo.ittalents.enemies.BossEnemy;

public class Cave {

	private BossEnemy theBoss;
	
	public Cave(){
		this.theBoss = new BossEnemy("Mehuto Gonzalez", 15, 200);
		this.theBoss.setItem(new Item("Heart of Mehuto"));
	}

	public BossEnemy getTheBoss() {
		return theBoss;
	}
	
}
