package homework.lesson.six;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String firstWord = null;
		String secondWord = null;
		StringBuilder sBuilder = new StringBuilder();
		
		do {
			System.out.println("Please enter 2 words with length between 10 and 20 characters:");
			firstWord = scan.nextLine();
			secondWord = scan.nextLine();
		} while (!isValid(firstWord) || !isValid(secondWord));

		for (int i = 0; i < getLongerStr(firstWord, secondWord).length(); i++) {
			if (i < 5) {
				sBuilder.append(getShorterStr(firstWord, secondWord).charAt(i));
			} 
			else {
				sBuilder.append(getLongerStr(firstWord, secondWord).charAt(i));
			}
		}
		
		
		System.out.printf("%d %s", getLongerStr(firstWord, secondWord).length(), sBuilder);
		
	}

	static boolean isValid(String input) {
		if (input.length() > 20 || input.length() < 10) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	static String getLongerStr(String firstStr, String secondStr){
		if (firstStr.length() >= secondStr.length()) {
			return firstStr;
		}
		return secondStr;
	}
	
	static String getShorterStr(String firstStr, String secondStr){
		if (firstStr.length() >= secondStr.length()) {
			return secondStr;
		}
		return firstStr;
	}

}
