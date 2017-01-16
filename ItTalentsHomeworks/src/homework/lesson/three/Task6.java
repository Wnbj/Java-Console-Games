package homework.lesson.three;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int input = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
