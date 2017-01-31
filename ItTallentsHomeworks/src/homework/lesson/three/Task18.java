package homework.lesson.three;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number int range 3..20: ");
		
		int input = scan.nextInt();
		System.out.print("Please enter an character: ");
		
		char symbol = scan.next().charAt(0);

		for (int i = 1; i <= input; i++) {
			if (i == 1 || i == input) {
				for (int j = 0; j < input; j++) {
					System.out.print('*');
				}
				System.out.println();
			} 
			else {
				for (int k = 1; k <= input; k++) {
					if (k == 1 || k == input) {
						System.out.print('*');
						if (k == input) {
							System.out.println();
						}
					} 
					else {
						System.out.print(symbol);
					}
				}
				
			}
		}
	}
}
