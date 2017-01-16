package homework.lesson.two;

import java.util.Scanner;

public class ProblemSixteen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 3 digit number: ");
		int number = scan.nextInt();

		int firstDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int thirdDigit = number % 10;

		if (firstDigit == secondDigit && secondDigit == thirdDigit) {
			System.out.println("All digits are equal.");
		} 
		else if (secondDigit > thirdDigit && secondDigit < firstDigit) {
			System.out.println("The digits are in increasing order.");
		}
		else if (thirdDigit > secondDigit && secondDigit > firstDigit) {
			System.out.println("The digits are in decreasing order.");
		} 
		else {
			System.out.println("The digits are misplaced.");
		}
		
	}
}
