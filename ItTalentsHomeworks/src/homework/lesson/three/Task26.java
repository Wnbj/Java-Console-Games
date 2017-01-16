package homework.lesson.three;

import java.util.Scanner;

public class Task26 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		
		int input = scan.nextInt();
		int result = input;
		
		do {
			input--;
			result *= input;
			
		} while (input != 1);
		
		System.out.println(result);
	}
}
