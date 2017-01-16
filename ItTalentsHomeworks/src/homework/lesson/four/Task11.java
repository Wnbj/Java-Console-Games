package homework.lesson.four;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[7];
		int counter = 0;

		System.out.printf("Please enter %d integer numbers separate by space: ", 7);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 0 && numbers[i] > 5) {
				System.out.printf("%d ", numbers[i]);
				counter++;
			}
		}
		System.out.printf("- %d numbers.", counter);

	}
}
