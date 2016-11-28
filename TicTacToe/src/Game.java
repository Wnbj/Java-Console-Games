import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Game implements Runnable {
	
	private Board theBoard;
	private Player player;
	private Player bot;
	
	public Game(){
		this.theBoard = new Board();
		this.player = new Player();
		 this.bot = new Player();
	}
	
	public void run(){
					
		theBoard.drawCanvas();
		theBoard.draw();
					
		if (randomGen(2) == 0) {
			player.setSymbol("X");
			bot.setSymbol("O");
		}
		else{
			player.setSymbol("O");
			bot.setSymbol("X");
		}
		
		Scanner scan = new Scanner(System.in);
		
		while (Player.availablePositions.size() > 0) {
										
			int input = 0;
			
			do {
				  input = scan.nextInt();
				
			} while (!player.getAvailablePositions().contains(input));
			
			player.move(input);
			theBoard.draw();
			
			if (isWin(player.getUsedPositions())) {
				System.out.println("YOU WIN!");
				break;
			}
			if (Player.availablePositions.size() == 0) {
				System.out.println("DRAW!");
				break;
			}
			
			bot.moveAI();
			theBoard.draw();
			
			if (isWin(bot.getUsedPositions())) {
				System.out.println("YOU LOSE!");
				break;
			}
									
		}	
		
	}
	
	public static boolean isWin(ArrayList<Integer> usedPositions){

		if (usedPositions.contains(1) && usedPositions.contains(2) && usedPositions.contains(3)){
			return true;
		}
		else if (usedPositions.contains(1) && usedPositions.contains(4) && usedPositions.contains(7)){
			return true;
		}
		else if (usedPositions.contains(7) && usedPositions.contains(8) && usedPositions.contains(9)){
			return true;
		}
		else if (usedPositions.contains(3) && usedPositions.contains(6) && usedPositions.contains(9)){
			return true;
		}
		else if (usedPositions.contains(4) && usedPositions.contains(5) && usedPositions.contains(6)){
			return true;
		}
		else if (usedPositions.contains(2) && usedPositions.contains(5) && usedPositions.contains(8)){
			return true;
		}
		else if (usedPositions.contains(1) && usedPositions.contains(5) && usedPositions.contains(9)){
			return true;
		}
		else if (usedPositions.contains(3) && usedPositions.contains(5) && usedPositions.contains(7)){
			return true;
		}
		
			return false;	
		
	}
	
	public static int randomGen(int number){
		Random random = new Random();
	    int temp = random.nextInt(number);
	    return temp;
	}	
	
}
