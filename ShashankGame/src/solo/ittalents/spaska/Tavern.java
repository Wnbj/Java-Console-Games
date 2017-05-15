package solo.ittalents.spaska;

public class Tavern {

	private Hero theHero;
	
	public Tavern(){
		
	}
	
	public Hero getTheHero() {
		return theHero;
	}

	public void setTheHero(Hero theHero) {
		this.theHero = theHero;
	}

	public void sleep(){
		this.theHero.setCurrentHealth(this.theHero.getHealth());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The hero is now in perfect condition.");
		System.out.println("----------------------------------------");
	}
	
	public void drink(){
		this.theHero.setCurrentHealth(this.theHero.getHealth() - 10);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The hero was drinking all night long so he lost 10 points from his current health.");
		System.out.println("----------------------------------------");
	}
	
	public void showHeroStats(){
		System.out.println(theHero.toString());
	}
	
}
