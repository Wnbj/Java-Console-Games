package homework.lesson.two;

import java.util.Scanner;

public class ProblemTwo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter two integer numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		
		int sum = numOne + numTwo;
		int diff = Math.abs(numOne - numTwo);
		int multi = numOne * numTwo;
		int div = numOne / numTwo;
		int resDiv = numOne % numTwo;
		
		System.out.printf("The sum of the two numbers is %d%n"
				+ "the difference is %d%n"
				+ "the multiplication is %d%n"
				+ "the division is %d%n"
				+ "and the residual division is %d", sum, diff, multi, div, resDiv);
	}
}
