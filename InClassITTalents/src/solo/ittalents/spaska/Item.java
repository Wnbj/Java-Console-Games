package solo.ittalents.spaska;

public class Item {

	private String name;
	private String type;
	private int increaseHealth;
	private int increaseDamage;
	
	public Item(String name){
		this.name = name;
		this.type = "artefact";
		this.increaseDamage = 0;
		this.increaseHealth = 0;	
	}
	
	public Item(String name, String type, int increaseHealth, int increaseDamage){
		this(name);
		this.type = type;
		this.increaseHealth = increaseHealth;
		this.increaseDamage = increaseDamage;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIncreaseHealth() {
		return increaseHealth;
	}

	public void setIncreaseHealth(int increaseHealth) {
		this.increaseHealth = increaseHealth;
	}

	public int getIncreaseDamage() {
		return increaseDamage;
	}

	public void setIncreaseDamage(int increaseDamage) {
		this.increaseDamage = increaseDamage;
	}
	//printing stats
	@Override
	public String toString() {
		return String.format("Name: %s%nType: %s%nBonus Damage: %d%nBonusHealth: %d%n",
				this.getName(),
				this.getType(),
				this.getIncreaseDamage(),
				this.getIncreaseHealth());
	}
	
}
