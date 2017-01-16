package homework.lesson.four;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int input = scan.nextInt();
		int length = 0;
		int temp = input;
		
		
		while(temp != 0){
			temp /= 2; 
			length++;
		}
		
		int[] binary = new int[length];
		
		for (int i = 0; i < binary.length; i++) {
			binary[length - 1 - i] = input % 2;
			input /= 2;
		}
		
		for (int nums : binary) {
			System.out.print(nums);
		}
	}
}
