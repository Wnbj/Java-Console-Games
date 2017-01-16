package homework.lesson.two;

import java.util.Scanner;

public class ProblemFive {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter three numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int numThree = scan.nextInt();

		if (numOne != numTwo || numOne != numThree) {

			if (numOne <= numTwo && numOne <= numThree) {
				if (numTwo <= numThree) {
					System.out.printf("%d %d %d", numThree, numTwo, numOne);
				} 
				else {
					System.out.printf("%d %d %d", numTwo, numThree, numOne);
				}
			}
			
			if (numTwo <= numOne && numTwo <= numThree) {
				if (numOne >= numThree) {
					System.out.printf("%d %d %d", numOne, numThree, numTwo);
				} 
				else {
					System.out.printf("%d %d %d", numThree, numOne, numTwo);
				}
			}
			
			if (numThree <= numOne && numThree <= numTwo) {
				if (numOne >= numTwo) {
					System.out.printf("%d %d %d", numOne, numTwo, numThree);
				} 
				else {
					System.out.printf("%d %d %d", numTwo, numOne, numThree);
				}
			}
		} 
		else if (numOne == numTwo && numOne == numThree) {
			System.out.printf("%d %d %d", numTwo, numOne, numThree);
		}

	}
}
