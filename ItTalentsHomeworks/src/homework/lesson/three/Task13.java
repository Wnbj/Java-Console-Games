package homework.lesson.three;

public class Task13 {
	public static void main(String[] args) {
		
		for (int i = 100; i <= 999; i++) {
			int numOne = 0;
			int numTwo = 0;
			int numThree = 0;
			
			numOne = i %10;
			numTwo = (i / 10) % 10;
			numThree = ((i / 10) / 10) % 10;
			
			if (numOne != numTwo && numTwo != numThree && numOne != numThree) {
				System.out.println(i);
			}
			
		}
		
	}
}
