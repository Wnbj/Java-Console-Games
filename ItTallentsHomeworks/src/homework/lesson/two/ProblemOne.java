package homework.lesson.two;

import java.util.Scanner;

public class ProblemOne {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter two numbers separate by space: ");
		
		double numOne = scan.nextDouble();
		double numTwo = scan.nextDouble();
		
		System.out.print("Please enter thirth number: ");
		
		double numThree = scan.nextDouble();
		
		if ((numOne < numThree && numThree < numTwo) || (numOne > numThree && numThree > numTwo)) {
			System.out.printf("The number %.1f is between %.1f and %.1f", numThree, numOne, numTwo );
		}
		else{
			System.out.printf("The number %.1f is not between %.1f and %.1f", numThree, numOne, numTwo );
		}
	}
}
