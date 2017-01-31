package homework.lesson.four;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Please enter the length of the first array: ");
		int firstLength = scan.nextInt();			
		int[] firstNums = new int[firstLength];		
		int smallerLenght = 0;
				
		System.out.printf("Please enter %d integer numbers separate by space: ", firstLength);
				
		for (int i = 0; i < firstLength; i++) {
			firstNums[i] = scan.nextInt();
		}
		
		System.out.print("Please enter the length of the second array: ");
		
		int secondLength = scan.nextInt();	
		int[] secondNums = new int[secondLength];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", secondLength);
		
		for (int i = 0; i < secondLength; i++) {
			secondNums[i] = scan.nextInt();
		}
		
		smallerLenght = firstLength >= secondLength? secondLength : firstLength;		
		int[] result = new int[smallerLenght];  
		
		for (int i = 0; i < result.length; i++) {
			if (firstNums[i] >= secondNums[i]) {
				result[i] = firstNums[i];
			}
			else{
				result[i] = secondNums[i];
			}
		}
		
		for (int i = 0; i < firstNums.length; i++) {
			if (i == firstNums.length - 1) {
				System.out.print(firstNums[i]);
				break;
			}
			System.out.print(firstNums[i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < secondNums.length; i++) {
			if (i == secondNums.length - 1) {
				System.out.print(secondNums[i]);
				break;
			}
			System.out.print(secondNums[i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i]);
				break;
			}
			System.out.print(result[i] + ", ");
		}
		
	}
}
