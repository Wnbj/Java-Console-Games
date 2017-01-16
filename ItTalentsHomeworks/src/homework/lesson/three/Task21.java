package homework.lesson.three;

public class Task21 {
	public static void main(String[] args) {
		
		for (int row = 0; row <= 9; row++) {
			for (int col = 0; col <=9; col++) {

				System.out.print(((row + col) % 10) + " ");
			}
			System.out.println();
		}
		
	}
}
