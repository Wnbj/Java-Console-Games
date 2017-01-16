package homework.lesson.three;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number int range 10..200: ");
		
		int input = scan.nextInt();
		
		for (int i = 100; i <= 999; i++) {
			int sum = (i %10) + ((i / 10) % 10) + (((i / 10) / 10) % 10);
			
			if (input == sum) {
				System.out.println(i);
			}
		}
	}
}
