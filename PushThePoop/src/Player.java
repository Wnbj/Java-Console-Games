import java.util.Random;

import interfaces.Moveable;

public class Player implements Moveable{
	
	private static Player instance = null;
	private static final char PIC = '\u263A';
	private Integer x;
	private Integer y;
	Random random = new Random();
	
	private Player(){
		this.x = random.nextInt(Pitch.height);
		this.y = random.nextInt(Pitch.width);
	}
	
	public static Player getInstance() {
	      if(instance == null) {
	         instance = new Player();
	      }
	      return instance;
	   }
	
	public static char getPic() {
		return PIC;
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
	
	public void move(int move) {
		if (move == 119) {
			if (instance.getX() - 1 >= 0 && instance.getX() <= Pitch.height) {
				if (Pitch.whatsOnTheField(instance.getX() - 1, instance.getY()) != BroomedArea.getPic()){				
					if (Pitch.whatsOnTheField(instance.getX() - 1, instance.getY()) == Poop.getPic()) {
						instance.setX(--x);
						Poop.getInstance().move(119);
					}
					else {
						instance.setX(--x);
					}
				}	
			}		
		}
		else if (move == 115) {
			if (instance.getX() + 1 >= 0 && instance.getX() + 1 < Pitch.height) {
				if (Pitch.whatsOnTheField(instance.getX() + 1, instance.getY()) != BroomedArea.getPic()) {
					if (Pitch.whatsOnTheField(instance.getX() + 1, instance.getY()) == Poop.getPic()) {
						instance.setX(++x);
						Poop.getInstance().move(115);
					}
					else {
						instance.setX(++x);
					}
				}			
			}
		}
		else if (move == 97) {
			if (instance.getY() - 1 >= 0 && instance.getY() - 1 < Pitch.width) {
				if (Pitch.whatsOnTheField(instance.getX(), instance.getY() - 1) != BroomedArea.getPic()) {
					if (Pitch.whatsOnTheField(instance.getX(), instance.getY() - 1) == Poop.getPic()) {
						instance.setY(--y);
						Poop.getInstance().move(97);
					}
					else {
						instance.setY(--y);
					}
				}		
			}
		}
		else if (move == 100) {
			if (instance.getY() + 1 >= 0 && instance.getY() + 1 < Pitch.width) {
				if (Pitch.whatsOnTheField(instance.getX(), instance.getY() + 1) != BroomedArea.getPic()) {
					if (Pitch.whatsOnTheField(instance.getX(), instance.getY() + 1) == Poop.getPic()) {
						instance.setY(++y);
						Poop.getInstance().move(100);
					}
					else {
						instance.setY(++y);
					}
				}					
			}
		}	
		
	}
	
}
