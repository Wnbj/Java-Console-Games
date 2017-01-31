package homework.lesson.three;

import java.util.Scanner;

public class Task23 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number in tange 1..999: ");
		int input = scan.nextInt();
		int counter = 1;

		while (counter <= 10) {			
			input++;
			if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0) {
				System.out.printf("%d:", counter);
				if (counter == 10) {
					System.out.print(input);
					break;
				}
				System.out.print(input + ", ");
				counter++;
			} 
		}
		
	}
}
