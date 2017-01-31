package homework.lesson.three;

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.print("Please enter a number in the range 1..51: ");
			number = scan.nextInt();
			
		} while (number < 1 || number > 52);

		for (int i = number; i <= 52; i++) {

			int cardNumber = ((i - 1) / 4) + 1;

			switch (cardNumber) {
			case 1:
				System.out.print("Deuce of ");
				break;
			case 2:
				System.out.print("Three of ");
				break;
			case 3:
				System.out.print("Four of ");
				break;
			case 4:
				System.out.print("Five of ");
				break;
			case 5:
				System.out.print("Six of ");
				break;
			case 6:
				System.out.print("Seven of ");
				break;
			case 7:
				System.out.print("Eight of ");
				break;
			case 8:
				System.out.print("Nine of ");
				break;
			case 9:
				System.out.print("Ten of ");
				break;
			case 10:
				System.out.print("Jack of ");
				break;
			case 11:
				System.out.print("Queen of ");
				break;
			case 12:
				System.out.print("King of ");
				break;
			case 13:
				System.out.print("Ace of ");
				break;
			}

			int cardSuite = i % 4;

			switch (cardSuite) {
			case 0:
				System.out.println("spades");
				break;
			case 1:
				System.out.print("clubs, ");
				break;
			case 2:
				System.out.print("diamonds, ");
				break;
			case 3:
				System.out.print("hearts, ");
				break;
			
			}
		}
		
	}
}
