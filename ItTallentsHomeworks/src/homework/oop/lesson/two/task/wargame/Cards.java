package homework.oop.lesson.two.task.wargame;

public class Cards {

	private String name;
	private int power;
	
	public Cards(String name, int power){
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
