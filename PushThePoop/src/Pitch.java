
import interfaces.Drawable;

public class Pitch implements Drawable{
	
	public static  int height;
	public static  int width;
	private static Character[][] thePitch; 
	
	public Pitch(int difficulty){
		
		if (difficulty == 1) {
			Pitch.height = 10;
			Pitch.width = 15;
			Pitch.thePitch = new Character[10][15];
		}
		else if (difficulty == 2) {
			Pitch.height = 15;
			Pitch.width = 20;
			Pitch.thePitch = new Character[15][20];
		}
		else if (difficulty == 3) {
			Pitch.height = 20;
			Pitch.width = 30;
			Pitch.thePitch = new Character[20][30];
		}
		else {
			System.out.println("I said 1, 2 or 3!");
		}
	}
	
	public void draw() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(thePitch[i][j]);
			}
			System.out.println();
		}
	}
	
	public void fillThePitch() {
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (thePitch[i][j] == null) {
					thePitch[i][j] = '-';
				}
			}
		}
		
	}
	
	public void putPlayer(int x, int y){
			
		thePitch[x][y] = Player.getPic();
		
	}
	
	public void putThePoop(int x, int y) {
		
		
			
			thePitch[x][y] = Poop.getPic();
		
	}
	
	public void putTheHole(int x, int y) {
		
		if (thePitch[x][y] == null) {
			
			thePitch[x][y] = TheHole.getPic();
		}
	}
	
	public void putTheBroomedAreas(int x, int y) {
		
		if (thePitch[x][y] == null) {
			
			thePitch[x][y] = BroomedArea.getPic();
		}
	}
	
	public void nullPrevPlayerPos(int x, int y){
		thePitch[x][y] = null;
	}
	
	public  static Character whatsOnTheField(int x, int y){
		if (x >= 0 && x < Pitch.height && y >= 0 && y < Pitch.width) {
			Character symbol = thePitch[x][y];
			return symbol;
		}
		return 0;
	}
	
}
