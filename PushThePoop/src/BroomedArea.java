import java.util.Random;

public class BroomedArea {
	
	private static final char PIC = '⛲';
	private int x;
	private int y;
	
	public BroomedArea(){
		Random random = new Random();
		this.x = random.nextInt(Pitch.height);
		this.y = random.nextInt(Pitch.width);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static char getPic() {
		return PIC;
	}
		
}
