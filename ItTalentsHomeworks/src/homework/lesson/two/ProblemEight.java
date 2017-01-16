package homework.lesson.two;

import java.util.Scanner;

public class ProblemEight {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter 4 digit number: ");
		int input = scan.nextInt();
		
		int numOne = (((input / 1000) *10 + input % 10));
		int numTwo = (((input / 100) % 10) *10 + ((input / 10) %10));
		
		if (numOne > numTwo) {
			System.out.printf("%d > %d", numOne, numTwo);
		}
		else if (numOne < numTwo) {
			System.out.printf("%d < %d", numOne, numTwo);
		}
		else {
			System.out.printf("%d = %d", numOne, numTwo);
		}
	}

}
