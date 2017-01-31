package homework.lesson.four;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			numbers[i] = scan.nextInt();
		}
		int smallest = Integer. MAX_VALUE; 
		
		for (int i = 1; i < numbers.length; i++) {				
			if (numbers[i] % 3 == 0 && numbers[i] < smallest) {	
				smallest = numbers[i];							
			}													
															
		}														 
																				
		System.out.printf(smallest != Integer.MAX_VALUE?"The smallest number which is multiple of three is %d.": "There is no number which is multiple of three.", smallest);
		
	}
}
