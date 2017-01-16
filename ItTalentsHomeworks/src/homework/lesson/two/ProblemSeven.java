package homework.lesson.two;

import java.util.Scanner;

public class ProblemSeven {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Wnat time is it ?: ");
		int time = scan.nextInt();
		
		System.out.print("How much money I have? : ");
		double money = scan.nextDouble();
		
		System.out.print("Am I healthy? :");
		boolean isHealthy = scan.nextBoolean();
		
		if (!isHealthy) {
			System.out.println("I am not going out.");
			if (money > 0) {
				System.out.println("I am going to buy medicine.");
			}
			else{
				System.out.println("I will stay at home and will drink some tea.");
			}
		}
		else {
			if (money >= 10) {
				System.out.println("I will go to the cinema with friends.");
			}
			else{
				System.out.println("I will go out with friends.");
			}
			
		}
		
	}

}
