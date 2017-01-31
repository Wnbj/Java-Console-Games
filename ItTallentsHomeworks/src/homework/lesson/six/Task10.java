package homework.lesson.six;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = "";
		StringBuilder sBuilder = new StringBuilder();

		do {
			System.out.println("Enter a string:");
			input = scan.nextLine().trim();
		} while (!isValid(input));

		char[] charInput = input.toCharArray();

		for (int i = 0; i < charInput.length; i++) {
			int ascii = charInput[i] + 5;	
			sBuilder.append((char)ascii);
		}
		
		System.out.println(sBuilder);

	}

	static boolean isValid(String input) {
		if (input.equals("")) {
			return false;
		}
		return true;
	}
}
