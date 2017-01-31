package homework.lesson.two;

import java.util.Scanner;

public class ProblemTen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter amount of water between 10 and 9999: ");
		int amount = scan.nextInt();
		
		int twoLitters = amount / 5;
		int threeLitters = twoLitters;
		
		if (amount % 5 == 2) {
			twoLitters++;
		}
		else if (amount % 5 == 3) {
			threeLitters++;
		}
		else if (amount % 5 == 1) {
			twoLitters--;
			threeLitters++;
		}
		else if (amount % 5 == 4) {
			twoLitters += 2;
		}
		
		int diff = Math.abs(twoLitters - threeLitters);
		
		if (twoLitters > threeLitters) {
			
			System.out.printf("%d two litters buckets, %d three litters buckets and %d additional two liter buckets.", twoLitters - diff, threeLitters, diff);
			
		}
		else if (twoLitters < threeLitters) {
			
			System.out.printf("%d two litters buckets, %d three litters buckets and %d additional three liter buckets.", twoLitters, threeLitters - diff, diff);
			
		}
		else {
			System.out.printf("%d two litters buckets and %d three litters buckets.", twoLitters, threeLitters);
		}
		
		
	}
}
