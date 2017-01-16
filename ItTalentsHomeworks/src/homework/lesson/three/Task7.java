package homework.lesson.three;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		
		int input = scan.nextInt();
		
		for (int i = 3; i <= input * 3 ; i+= 3) {
		System.out.print(i);
		if (i == input * 3) {
			break;
		}
		System.out.print(',');
		}
		
	}
}
