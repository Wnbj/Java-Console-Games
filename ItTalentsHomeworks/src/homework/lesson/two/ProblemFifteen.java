package homework.lesson.two;

import java.util.Scanner;

public class ProblemFifteen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter hour:");
		int hour = scan.nextInt();

		if (hour >= 4 && hour < 9) {
			System.out.println("Good morning.");
		} 
		else if (hour >= 9 && hour < 18) {
			System.out.println("Good day.");
		} 
		else if (hour >= 18 && hour <= 24) {
			System.out.println("Good evening.");
		} 
		else if (hour >= 0 && hour < 4) {
			System.out.println("Good evening.");
		}
		else {
			System.out.println("Invalid hour.");
		}
		
	}
}
