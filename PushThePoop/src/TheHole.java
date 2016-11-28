import java.util.Random;

public class TheHole {
	
	private static TheHole instance = null;
	private static final char PIC = '⛳';
	private int x;
	private int y;
	
	private TheHole(){
		Random random = new Random();
		this.x = random.nextInt(Pitch.height);
		this.y = random.nextInt(Pitch.width);
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static TheHole getInstance() {
	      if(instance == null) {
	         instance = new TheHole();
	      }
	      return instance;
	   }
	
	public static char getPic() {
		return PIC;
	}

}
