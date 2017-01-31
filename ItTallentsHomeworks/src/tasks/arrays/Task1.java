package tasks.arrays;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] numbers = new int[length];
		boolean isAlPossitive =  true;
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
			if (numbers[i] < 0) {
				isAlPossitive = false;
				break;
			}
		}
		System.out.println(isAlPossitive);
		
	}
}
