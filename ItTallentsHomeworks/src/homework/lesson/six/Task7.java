package homework.lesson.six;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = null;
		int bestLength = 0;
		int bestLengthIndex = 0;
		
		do {
			System.out.println("Please enter a sentence:");
			input = scan.nextLine().trim();
		} while (!isValid(input));

		String[] words = input.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > bestLength) {
				bestLengthIndex = i;
				bestLength = words[i].length();
			}
		}
		System.out.printf("%d words, the longest is %s", words.length, words[bestLengthIndex]);
	}

	static boolean isValid(String input){
		if (input.equals("")) {	
			return false;
		}		
		return true;
	}
}
