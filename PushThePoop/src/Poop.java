import java.util.Random;

import interfaces.Moveable;

public class Poop implements Moveable{
	
	private static Poop instance = null;
	private static final char PIC = '♨';
	private  Integer x;
	private  Integer y;
	
	private Poop(){
		Random random = new Random();
		this.x = random.nextInt(Pitch.height -2) +1;
		this.y = random.nextInt(Pitch.width -2) +1;
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

	public static Poop getInstance() {
	      if(instance == null) {
	         instance = new Poop();
	      }
	      return instance;
	   }
	
	public static char getPic() {
		return PIC;
	}
	
	public void move(int move) {
		if (move == 119) {
			if (instance.getX() - 1 >= 0 && instance.getX() <= Pitch.height) {
				if (Pitch.whatsOnTheField(instance.getX() - 1, instance.getY()) != BroomedArea.getPic()){
					instance.setX(--x);	
				}
				
			}
			
		}
		else if (move == 115) {
			if (instance.getX() + 1 >= 0 && instance.getX() + 1 < Pitch.height) {
				if (Pitch.whatsOnTheField(instance.getX() + 1, instance.getY()) != BroomedArea.getPic()){
					instance.setX(++x);	
				}
				
			}
		}
		else if (move == 97) {
			if (instance.getY() - 1 >= 0 && instance.getY() <= Pitch.width) {
				if (Pitch.whatsOnTheField(instance.getX(), instance.getY() - 1) != BroomedArea.getPic()){
					instance.setY(--y);	
				}
				
			}
		}
		else if (move == 100) {
			if (instance.getY() + 1 >= 0 && instance.getY() + 1 < Pitch.width) {
				if (Pitch.whatsOnTheField(instance.getX(), instance.getY() + 1) != BroomedArea.getPic()){
					instance.setY(++y);	
				}
				
			}
		}
	}
	
}
