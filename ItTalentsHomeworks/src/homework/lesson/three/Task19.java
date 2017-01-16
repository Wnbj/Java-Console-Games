package homework.lesson.three;

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two integer numbers in range 1..9, separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		
		for (int i = 1; i <= numOne; i++) {
			for (int j = 1; j <= numTwo; j++) {
				int result = i * j;
				System.out.printf("%d*%d=%d;%n",i, j, result);
			}
		}
		
	}
}
