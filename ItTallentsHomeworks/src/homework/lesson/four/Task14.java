package homework.lesson.four;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();	
		int secondLength = 0;
		double[] firstNums = new double[length];
		 
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			firstNums[i] = scan.nextDouble();
			if (firstNums[i] >= -2.99 && firstNums[i] <= 2.99) {
				secondLength++;
			}
		}
		
		double[] secondNums = new double[secondLength];
		int counter =0;
		
		for (int i = 0; i < firstNums.length; i++) {
			if (firstNums[i] >= -2.99 && firstNums[i] <= 2.99) {
				secondNums[counter] = firstNums[i];
				counter++;
			}
		}
		
		for (double nums : secondNums) {
			System.out.print(nums + " ");
		}
						
	}
}
