package tasks.arrays;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] numbers = new int[length];
		boolean isJugged =  true;
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
			
			}
		
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i] <= numbers[i-1] && numbers[i] >= numbers[i+1]) {
				isJugged = false;
				break;
			}
			
		}
		System.out.println(isJugged);
		
	}
}
