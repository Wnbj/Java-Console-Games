package homework.lesson.three;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		
		int n = scan.nextInt();
		int temp = n - 2;
		
		for (int i = 1; i <= n; i++) {
			temp += 2;
			for (int j = 0; j <= n -1; j++) {
				System.out.print(temp -1);				
			}
			System.out.println();
		}
		
	}
}
