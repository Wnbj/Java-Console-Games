package homework.lesson.three;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number in range 10..200: ");
		
		int input = scan.nextInt();
		
		for (int i = input; i >= 10; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
