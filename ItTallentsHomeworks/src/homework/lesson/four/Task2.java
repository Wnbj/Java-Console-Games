package homework.lesson.four;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		int[] newNumbers = new int[numbers.length];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
		for (int i = 0; i < length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length / 2) {
				newNumbers[i] = numbers[i];
			}
			else{
				newNumbers[i] = numbers[numbers.length - i + numbers.length / 2 - 1];
			}
		}
		
		for (int num : newNumbers) {
			System.out.printf("%d ", num);
		}
		
	}
}
