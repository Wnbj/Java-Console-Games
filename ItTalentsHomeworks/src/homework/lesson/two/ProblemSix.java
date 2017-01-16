package homework.lesson.two;

import java.util.Scanner;

public class ProblemSix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter three numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int numThree = scan.nextInt();
		int temp = numOne;
		
		numOne = numTwo;
		numTwo = numThree;
		numThree = temp;
		
		System.out.printf("%d %d %d", numOne, numTwo, numThree);
		
	}
}
