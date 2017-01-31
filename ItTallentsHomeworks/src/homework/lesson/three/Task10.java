package homework.lesson.three;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		
		int input = scan.nextInt();
		boolean isPrime = true;
		
		if (input % 2 == 0) {
			isPrime = false;
		}
		
		for (int i = 3; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime.");
		}
		
	}
}
