package homework.oop.lesson.two.task.wargame;

public class WarGame {
	
	private Player playerOne;
	private Player playerTwo;
	private Deck theDeck;
	
	public WarGame() {
		this.theDeck = new Deck();
		this.playerOne = new Player("Shashank", theDeck.getPlayerOneCards());
		this.playerTwo = new Player("Mustafa", theDeck.getPlayerTwoCards());
	}
	
	private void play(){
		int counter = 0;
		int playerOneWin = 0;
		int playerTwoWin = 0;
		Cards[] playerOneWiningHands = new Cards[Deck.DECK_SIZE];
		Cards[] playerTwoWiningHands = new Cards[Deck.DECK_SIZE];
		boolean isWar = false;
		
		while (counter < Deck.DECK_SIZE/2) {
			System.out.println(playerOne.getName() + " have a " + playerOne.getCard(counter).getName());
			System.out.println(playerTwo.getName() + " have a " + playerTwo.getCard(counter).getName());
			
			if (playerOne.getCard(counter).getPower() > playerTwo.getCard(counter).getPower()) {
				System.out.println(playerOne.getName() + " wins the hand.");
				System.out.println();
				playerOneWiningHands[playerOneWin] = playerOne.getCard(counter);
				playerOneWiningHands[playerOneWin+1] = playerTwo.getCard(counter);
				playerOneWin += 2;
				counter++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if (playerOne.getCard(counter).getPower() < playerTwo.getCard(counter).getPower()) {
				System.out.println(playerTwo.getName() + " wins the hand.");
				System.out.println();
				playerTwoWiningHands[playerTwoWin] = playerTwo.getCard(counter);
				playerTwoWiningHands[playerTwoWin+1] = playerOne.getCard(counter);
				playerTwoWin += 2;
				counter++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else{
				System.out.println("This means war!");
				isWar = true;
				if (counter >= Deck.DECK_SIZE/2 - 2 && counter <Deck.DECK_SIZE/2) {
					counter++;
				}
				while (isWar && counter < Deck.DECK_SIZE/2 - 2) {
							
					System.out.println(playerOne.getName() +
					" have a " + 
					playerOne.getCard(counter).getName() + " " +
					playerOne.getCard(counter+1).getName() + " and " +
					playerOne.getCard(counter+2).getName()
					);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(playerTwo.getName() +
					" have a " + 
					playerTwo.getCard(counter).getName() + " " +
					playerTwo.getCard(counter+1).getName() + " and " +
					playerTwo.getCard(counter+2).getName()
					);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					if (playerOne.getCard(counter+2).getPower() > playerTwo.getCard(counter+2).getPower()) {
						System.out.println(playerOne.getName() + " wins the war.");
						System.out.println();
						isWar = false;
					}
					else if (playerOne.getCard(counter+2).getPower() < playerTwo.getCard(counter+2).getPower()) {
						System.out.println(playerTwo.getName() + " wins the war.");
						System.out.println();
						isWar = false;
					}
					counter += 3;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		if (playerOneWin > playerTwoWin) {
			System.out.println(playerOne.getName() + " WINS THE GAME!");
		}
		else if(playerOneWin < playerTwoWin){
			System.out.println(playerTwo.getName() + " WINS THE GAME!");
		}
		else {
			System.out.println("DRAW!");
		}
				
	}
	
	public static void main(String[] args) {
		WarGame game = new WarGame();
		game.play();
	}
	
}
