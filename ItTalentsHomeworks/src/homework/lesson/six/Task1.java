package homework.lesson.six;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		String firstText = null;
		String secondText = null;
		
		do {
			System.out.println("Please enter 2 strings up to 40 characters each:");
			firstText = scan.nextLine();
			secondText = scan.nextLine();
		} while (!isValid(firstText) || !isValid(secondText));
		
		System.out.printf("%s %s %s %s", firstText.toUpperCase(), firstText.toLowerCase(), secondText.toUpperCase(), secondText.toLowerCase());
		
	}
	
	static boolean isValid(String input){
		if (input.length() >  40 || input.equals("")) {	
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				return false;
				}
			}			
		return true;
	}
}
