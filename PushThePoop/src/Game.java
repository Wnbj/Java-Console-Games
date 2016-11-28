import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Difficulty : 1 - Easy | 2 - Normal | 3 - Hard ");
		
		int difficulty = scan.nextInt();
		int numOfBroomedAreas = 0;
		boolean isHoleReached = false;
		
		Pitch pitch = new Pitch(difficulty);	
		Player player = Player.getInstance();
		Poop poop = Poop.getInstance();		
		TheHole theHole = TheHole.getInstance();
			
		if (difficulty == 2) {
			numOfBroomedAreas = (Pitch.height * Pitch.width) / 25;
		}
		else if (difficulty == 3) {
			numOfBroomedAreas = (Pitch.height * Pitch.width) / 20;
		}
		else {
			numOfBroomedAreas = (Pitch.height * Pitch.width) / 30;
		}
			
		pitch.putPlayer(player.getX(), player.getY());
		pitch.putTheHole(theHole.getX(), theHole.getY());
		pitch.putThePoop(poop.getX(), poop.getY());
		
		for (int i = 0; i < numOfBroomedAreas; i++) {
			BroomedArea broomedArea = new BroomedArea();
			if (Pitch.whatsOnTheField(broomedArea.getX(), broomedArea.getY()) == null) {
				pitch.putTheBroomedAreas(broomedArea.getX(), broomedArea.getY());
			}
			else{
				i--;
			}
			
		}
				
		pitch.fillThePitch();
		pitch.draw();
		
		while(!isHoleReached){
			
			int tempX = player.getX();
			int tempY = player.getY();
			
			pitch.nullPrevPlayerPos(tempX, tempY);
			player.move(scan.next().charAt(0));
			pitch.putPlayer(player.getX(), player.getY());
			pitch.putThePoop(poop.getX(), poop.getY());
			pitch.fillThePitch();
			pitch.draw();
			
			if (poop.getX() == theHole.getX() && poop.getY() == theHole.getY()) {
				isHoleReached = true;
				System.out.println("You won!");
			}
			if (poop.getX() == player.getX() && poop.getY() == player.getY()) {
				System.out.println("You just waded into the poops. Loser! ");
				break;
			}
		}
		
	}
}
