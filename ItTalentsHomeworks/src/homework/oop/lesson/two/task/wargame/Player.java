package homework.oop.lesson.two.task.wargame;

public class Player {

	private String name;
	private Cards[] playerDeck;
	private Cards[] winingHands;
	
	public Player(String name, Cards[] playerDeck){
		this.name = name;
		this.playerDeck = playerDeck;
		this.winingHands = new Cards[52];
	}

	public String getName() {
		return name;
	}

	public Cards[] getPlayerDeck() {
		return playerDeck;
	}

	public void setWiningHands(Cards[] winingHand) {
		this.winingHands = winingHand;
	}	
	
	public Cards getCard(int pos){
		return playerDeck[pos];
	}
	
}
