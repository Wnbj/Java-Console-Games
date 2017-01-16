package homework.lesson.two;

import java.util.Scanner;

public class ProblemFour {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		
		if (numOne > numTwo) {
			System.out.printf("%d %d", numTwo, numOne);
		}
		else{
			System.out.printf("%d %d", numOne, numTwo);
		}
	}
}
