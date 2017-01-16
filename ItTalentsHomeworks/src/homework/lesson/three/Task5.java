package homework.lesson.three;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter two integer numbers separate by space: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp =0;
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for (int i = a; i <= b ; i++) {
			System.out.println(i);
		}
		
	}
}
