package homework.oop.lesson.two.task.wargame;

import java.util.Random;

public class Deck {

	private Cards[] cards;
	private Cards[] playerOneCards;
	private Cards[] PlayerTwoCards;
	
	
	public Deck(){
		this.cards = new Cards[52];
		this.createDeck();
		this.shuffle(cards);
		this.playerOneCards = new Cards[26];
		this.PlayerTwoCards = new Cards[26];
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
		
		for (int i = 0; i < fullDeck.length; i++) {
			if (i < 26) {
				playerOneCards[i] = fullDeck[i];
			}
			else{
				PlayerTwoCards[i - 26] = fullDeck[i];
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
