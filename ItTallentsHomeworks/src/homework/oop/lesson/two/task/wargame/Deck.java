package homework.oop.lesson.two.task.wargame;

import java.util.Random;

public class Deck {

	public static final int DECK_SIZE = 52;
	private Cards[] cards;
	private Cards[] playerOneCards;
	private Cards[] PlayerTwoCards;
	
	
	public Deck(){
		this.cards = new Cards[DECK_SIZE];
		this.createDeck();
		this.shuffle(cards);
		this.playerOneCards = new Cards[DECK_SIZE/2];
		this.PlayerTwoCards = new Cards[DECK_SIZE/2];
		this.deal(cards);
	}
	
	public void createDeck(){

		String[] cardNames = {
				"Duce", 
				"Three",
				"Four",
				"Five",
				"Six",
				"Seven",
				"Eight",
				"Nine",
				"Ten",
				"Jack",
				"Queen",
				"King",
				"Ace"
				};
		
		int counter = 0;
		int cardNamesCounter = 0;
		while (counter < 49) {
			for (int i = 0; i < 4; i++) {
				cards[counter] = new Cards(cardNames[cardNamesCounter], cardNamesCounter);
				counter++;
			}
			cardNamesCounter++;
		}
		
	}
	
	public void printDeck(){
		for (Cards cards2 : PlayerTwoCards) {
			System.out.println(cards2.getPower());
		}	
	}
	
	public void shuffle(Cards[] array)
	{
	    int index = 0;
	    Cards temp = null;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
	    }
	}
	
	private void deal(Cards[] fullDeck){
		
		int playerOneCounter = 0;
		int playerTwoCounter = 0;
		
		for (int i = 0; i < fullDeck.length; i++) {
			
			if (playerOneCounter > DECK_SIZE/2 || playerTwoCounter > DECK_SIZE/2) {
				break;
			}
			if (i % 2 == 0) {
				playerOneCards[playerOneCounter] = fullDeck[i];
				playerOneCounter++;
			}
			else{
				PlayerTwoCards[playerTwoCounter] = fullDeck[i];
				playerTwoCounter++;
			}
		}
		
	}

	public Cards[] getPlayerOneCards() {
		return playerOneCards;
	}

	public Cards[] getPlayerTwoCards() {
		return PlayerTwoCards;
	}
	
}
