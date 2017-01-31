package homework.lesson.two;

import java.util.Scanner;

public class ProblemEleven {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int temp = input;
		int thirdDigit = input % 10;
		input /= 10;
		int secondDigit = input % 10;
		input /= 10;
		int firstDigit = input % 10;

		if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0) {
			if ((temp % firstDigit == 0) && (temp % secondDigit == 0) && (temp % thirdDigit == 0)) {

				System.out.println("The number is divisable by all it's digits.");

			} else {

				System.out.println("The number is not divisable by all it's digits.");

			}
		} else {
			System.out.println("Invalid input, one of the entered digits is equal to 0. Please enter another number!");
		}
		
	}
}
