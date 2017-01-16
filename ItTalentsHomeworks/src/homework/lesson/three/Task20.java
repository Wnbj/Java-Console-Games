package homework.lesson.three;

import java.util.Scanner;

public class Task20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number in range 10 and 99: ");
		
		int number = scan.nextInt();
		
		do {
			if (number % 2 == 0) {
				number = number / 2;
			} else
				number = 3 * number + 1;
			System.out.print(number + " ");
		} while (number > 1);
		
		System.out.println();
	}
		
}
