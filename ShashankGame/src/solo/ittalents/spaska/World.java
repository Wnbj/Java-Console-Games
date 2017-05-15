package solo.ittalents.spaska;

import java.util.Random;
import java.util.Scanner;

public class World implements Runnable{

	private Tavern theTavern;
	private Cave theCave;
	private Wood theWood;
	private Hero theHero;
	
	public World(){
		this.theTavern = new Tavern();
		this.theCave = new Cave();
		this.theWood = new Wood();
		this.theHero = new Hero("Krachko");
	}

	@Override
	public void run() {
		while(true){
			Scanner scan = new Scanner(System.in);
			
			Random random = new Random();
			int enemyIdx = random.nextInt(5);
			String whereToGo = whereToGo();
			
			if (whereToGo.equals("w")) {
				
				System.out.printf("You are at the wood now. %s is staying infront of you.%nEnter \"s\" if you want to see %s stats.",
						theWood.getCreeps().get(enemyIdx).getName(),
						theWood.getCreeps().get(enemyIdx).getName()
						);
				System.out.println("If you want to choose another location enter \"m\"");
				System.out.println("----------------------------------------");
				String location = scan.nextLine();
				
				if (location.equals("s")) {
					
					
					System.out.println(theWood.getCreeps().get(enemyIdx).toString());
					System.out.println("----------------------------------------");
					System.out.printf("Do you want to fight the %s?  Y/N%n", theWood.getCreeps().get(enemyIdx).getName());
					String fightOrNot = scan.nextLine();
					if (fightOrNot.equals("Y")) {
						
						theHero.fight(theWood.getCreeps().get(enemyIdx));
						System.out.println("Your Health is very low. Do you want to go to the Tavern to heal? Y/N");
						String goToTavern = scan.nextLine();
						
						if (goToTavern.equals("Y")) {
							
							theTavern.setTheHero(theHero);
							theTavern.sleep();
						}
						else if(theWood.getCreeps().get(enemyIdx).isAlive()){
							
							theHero.setAlive(false);
							System.out.println("----------------------------------------");
							System.out.println("You died!");
							System.out.println("GAME OVER!");
							System.out.println("----------------------------------------");
							break;
						}
					}
				}
				else if (location.equals("m")) {
					System.out.println("OK lets see the map.");
				}

			}
			else if (whereToGo.equals("t")) {
				System.out.println("Welcome to the Tavern!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("If you like to see the hero stats enter \"s\"%nIf you like to see hero items enter \"i\"%nTo continue press \"Enter\"");
				String seeHeroStats = scan.nextLine();
				if (seeHeroStats.equals("s")) {
					theTavern.setTheHero(theHero);
					System.out.println("The hero stats are:");
					System.out.println("----------------------------------------");
					theTavern.showHeroStats();
					System.out.println("----------------------------------------");
				}
				else if (seeHeroStats.equals("i")) {
					theTavern.setTheHero(theHero);
					System.out.println("The hero items are :");
					System.out.println("----------------------------------------");
					theHero.printItems();
					System.out.println("----------------------------------------");
				}
				
				if (theHero.getCurrentHealth() == theHero.getHealth()) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("----------------------------------------");
					System.out.println("The hero is in good condition so he is going for some drinks.");
					theTavern.setTheHero(theHero);
					theTavern.drink();
				}
				else {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("----------------------------------------");
					System.out.println("The hero is going to sleep. When he wake up his current health will be full.");
					theTavern.setTheHero(theHero);
					theTavern.sleep();
				}
			}
			else if (whereToGo.equals("c")) {
				System.out.println("----------------------------------------");
				System.out.println("You are now staying infront the Mehuto den.");
				System.out.println("Go inside and fight Mehuto Gonzalez? Y/N");
				System.out.println("----------------------------------------");
				String fightMehuto = scan.nextLine();
				
				if (fightMehuto.equals("Y")) {
					theHero.fight(theCave.getTheBoss());
					if (!theCave.getTheBoss().isAlive()) {
						System.out.println("----------------------------------------");
						System.out.println("You just killed the all mighty Mehuto Gonzalez!");
						System.out.println("YOU WON THE GAME!");
						System.out.println("----------------------------------------");
						break;
					}
					
					System.out.println("Your Health is very low. Do you want to go to the Tavern to heal? Y/N");
					String goToTavern = scan.nextLine();
					
					if (goToTavern.equals("Y")) {
						
						theTavern.setTheHero(theHero);
						theTavern.sleep();
					}
					
				}
				
			}
		}
		
	}
	
	private String whereToGo(){
		Scanner scan = new Scanner(System.in);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------");
		System.out.printf("Where do you like to go?%n"
				+ "Go to the wood - enter \"w\"%n"
				+ "Go to the Tavern - enter \"t\"%n"
				+ "Go to the cave of the mighty Mehuto Gonzalez - enter \"c\"%n");
		System.out.println("----------------------------------------");
		
		return scan.nextLine();
		
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.run();
	}
	
}
