package homework.lesson.two;

import java.util.Scanner;

public class ProblemThree {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Please enter two numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int temp = numOne;
		numOne = numTwo;
		numTwo = temp;
		
		System.out.printf("%d %d", numOne, numTwo);
	}
}
