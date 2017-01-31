package homework.lesson.two;

import java.util.Scanner;

public class ProblemNine {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integer numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int multiply = numOne * numTwo;
		int lastDigit = multiply % 10;
		
		if (lastDigit % 2 == 0) {
			System.out.printf("%d, %d is even.", multiply, lastDigit);
		}
		else {
			System.out.printf("%d, %d is odd.", multiply, lastDigit);
		}
		
	}
}
