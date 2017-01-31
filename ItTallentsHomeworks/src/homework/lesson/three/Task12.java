package homework.lesson.three;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		
		int n = scan.nextInt();
		int stars = 1;
		int spaces = n - 1;
		

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < spaces; j++) {
				System.out.print('*');				
			}
			for (int j = 0; j < stars; j++) {
				if (i != n) {
					System.out.print(' ');
				}
				else{
					System.out.print('*');
				}
				
			}
			for (int j = 0; j < spaces; j++) {
				System.out.print('*');				
			}							
			System.out.println();
			stars += 2;
			spaces--;			
		}
				
	}
}
