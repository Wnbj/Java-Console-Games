package homework.lesson.three;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		
		int input = scan.nextInt();
		int sum = 0;
		
		do {
			sum += input;
			input--;
			
		} while (input != 0);
		
		System.out.println(sum);
	}
}
