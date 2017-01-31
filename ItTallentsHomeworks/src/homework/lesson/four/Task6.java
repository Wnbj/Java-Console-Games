package homework.lesson.four;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Please enter the length of the first array: ");
		int firstLength = scan.nextInt();			
		int[] firstNums = new int[firstLength];
				
		System.out.printf("Please enter %d integer numbers separate by space: ", firstLength);
				
		for (int i = 0; i < firstLength; i++) {
			firstNums[i] = scan.nextInt();
		}
		
		System.out.print("Please enter the length of the second array: ");
		
		int secondLength = scan.nextInt();	
		int[] secondNums = new int[secondLength];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", firstLength);
		
		for (int i = 0; i < secondLength; i++) {
			secondNums[i] = scan.nextInt();
		}

		boolean isEqualLength = false;
		boolean isEqual = false;
		
		if (firstNums.length == secondNums.length) {
			isEqualLength = true;
			
			for (int i = 0; i < firstNums.length; i++) {
				if (firstNums[i] != secondNums[i]) {
					isEqual = false;
					break;
				}
				else{
					isEqual = true;
				}
			}
			
		}
		
		if (!isEqualLength) {
			System.out.println("The arrays are with different length, so they are different in general.");
		}
		else if (isEqualLength && !isEqual) {
			System.out.println("The arrays are with aqual length, but they are not equal by elements.");
		}
		else {
			System.out.println("The arrays are with equal length and they are equal by elements.");
		}
		
	}
}
