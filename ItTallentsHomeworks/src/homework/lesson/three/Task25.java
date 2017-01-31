package homework.lesson.three;

import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number in tange 10..30000: ");
		int number = scan.nextInt();
		int reverseNum = 0;
		int tempNum = number;
		
		do {
			int digit = number % 10;
			reverseNum = (reverseNum * 10) + digit;
			number /= 10;
		} while (number > 0);

		if (reverseNum == tempNum) {
			System.out.println(tempNum + " is palindorme.");
		} else {
			System.out.println(tempNum + " is not palindrome.");
		}
		
	}
}
