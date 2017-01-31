package homework.lesson.two;

import java.util.Scanner;

public class ProblemThirteen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter temperature: ");
		int temperature = scan.nextInt();

		if (temperature < -20 && temperature >= -100) {
			System.out.println("Freezing cold.");
		} 
		else if (temperature >= -20 && temperature <= 0) {
			System.out.println("Cold.");
		} 
		else if (temperature > 0 && temperature <= 15) {
			System.out.println("Chilly.");
		} 
		else if (temperature > 15 && temperature <= 25) {
			System.out.println("Warm.");
		} 
		else if (temperature > 25 && temperature <= 100) {
			System.out.println("Hot.");
		}
		else {
			System.out.println("Invalid input. Temperature must be between -100 and 100.");
		}
	}
}
