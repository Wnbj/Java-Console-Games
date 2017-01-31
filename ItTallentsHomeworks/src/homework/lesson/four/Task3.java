package homework.lesson.four;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int input = scan.nextInt();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			if (i < 2) {
				numbers[i] = input;
			}
			else{
				numbers[i] = numbers[i - 2] + numbers[i - 1];
			}
		}
		for (int num : numbers) {
			System.out.printf("%d ", num);
		}
		
	}
}
