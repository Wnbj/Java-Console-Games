package homework.lesson.seven;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number to check if it is prime:");
		int input = scan.nextInt();
		int checker = 2;
		
		if (isPrime(input, checker)) {
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime.");
		}
		
		
	}
	
	static boolean isPrime(int number, int checker){
		if (checker == number) {
			return true;
		}
		
		if (number % checker == 0) {
			return false;
		}
		return isPrime(number, checker + 1);
	}
	
}
