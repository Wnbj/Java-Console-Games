package homework.lesson.four;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		double sum = 0;		
		int best = 0;
		int closest = Integer.MAX_VALUE;
		
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		double average = sum / numbers.length;
		
		for (int i = 0; i < numbers.length; i++) {
			if (Math.abs(average - numbers[i]) < closest) {			
				best = numbers[i];
				closest = Math.abs((int)(average + 0.5) - numbers[i]);
				if(closest == 0){
					break;
				}
			}
		}
		System.out.printf("Average %.2f, closest to average %d.", average, best );
		
	}
}
