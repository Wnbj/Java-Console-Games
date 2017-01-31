package homework.lesson.four;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = temp;
			
		}
		
		for (int nums : numbers) {
			System.out.printf("%d ", nums);
		}
		
	}
}
