
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {
	
	private String symbol;
	public static ArrayList<Integer> availablePositions = new ArrayList<>();
	private ArrayList<Integer> usedPositions = new ArrayList<>();
	
	public Player(){
		if (availablePositions.size() == 0) {
			availablePositions.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		}

	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public  ArrayList<Integer> getAvailablePositions() {
		return availablePositions;
	}

	public ArrayList<Integer> getUsedPositions() {
		return usedPositions;
	}

	public void move(int coordinate){
		Board.setTheBoard(coordinate, this.symbol);
		if (availablePositions.contains(coordinate)) {
			availablePositions.remove(availablePositions.lastIndexOf(coordinate));
			usedPositions.add(coordinate);
		}
		
	}
	
	public void moveAI(){
		Collections.shuffle(availablePositions);
		Board.setTheBoard(availablePositions.get(0), this.symbol);
		usedPositions.add(availablePositions.get(0));
		availablePositions.remove(availablePositions.get(0));
	}
		
}
