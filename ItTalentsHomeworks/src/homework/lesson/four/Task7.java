package homework.lesson.four;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] firstNumbers = new int[length];
		int[] secondNumbers = new int[length];
				
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			firstNumbers[i] = scan.nextInt();
			if (i == 0 || i == length - 1) {
				secondNumbers[i] = firstNumbers[i];
			}
		}
		
		for (int i = 1; i < secondNumbers.length - 1; i++) {
			secondNumbers[i] = firstNumbers[i - 1] + firstNumbers[i + 1];
		}
		
		for (int num : secondNumbers) {
			System.out.printf("%d ", num);
		}
		
	}
}
