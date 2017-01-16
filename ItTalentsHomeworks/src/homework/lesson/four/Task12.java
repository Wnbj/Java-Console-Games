package homework.lesson.four;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[7];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", 7);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		int temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;
		
		numbers[2] = numbers[2] + numbers[3]; 
		numbers[3] = numbers[2] - numbers[3];
		numbers[2] = numbers[2] - numbers[3];
		
		numbers[4] = numbers[4] * numbers[5];
		numbers[5] = numbers[4] / numbers[5];
		numbers[4] = numbers[4] / numbers[5];
		
		for (int nums : numbers) {
			System.out.printf("%d ", nums);
		}
	}
}
