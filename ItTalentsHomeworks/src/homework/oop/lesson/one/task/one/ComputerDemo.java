package homework.oop.lesson.one.task.one;

public class ComputerDemo {
	public static void main(String[] args) {
		
		Computer firstComp = new Computer();
		Computer secondComp = new Computer(2015, 540, 200000, 3555);
		Computer thirdComp = new Computer(2017, 2500, false, 999999, 5555, "Linux");
		
		if (secondComp.comparePrice(thirdComp) == -1) {
			System.out.println("secondComp is more expensive than the thirdComp");
		}
		else if(secondComp.comparePrice(thirdComp) == 1){
			System.out.println("thirdComp is more expensive than the secondComp");
		}
		else{
			System.out.println("The price of the both computers are equal.");
		}		
		
	}
}
