package homework.lesson.three;

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two integer numbers in range 10..5555, separate by space: ");
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if (n > m) {
			int temp = n;
			n = m;
			m = temp; 
			
		}
		
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
