package homework.lesson.six;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		String firstText = null;
		String secondText = null;
		do {
			System.out.println("Please enter 2 strings without space:");
			firstText = scan.nextLine();
			secondText = scan.nextLine();
		} while (!isValid(firstText) || !isValid(secondText));
		
		if (firstText.length() == secondText.length()) {
			if (firstText.equals(secondText)) {
				System.out.println("Both String are equal.");
			}
			else {
				System.out.println("Difference by possisions are:");
				for (int i = 0; i < firstText.length(); i++) {
					if (firstText.charAt(i) != secondText.charAt(i)) {
						System.out.printf("%d %c-%c%n", i + 1, firstText.charAt(i), secondText.charAt(i));
					}
				}
				
			}
		}
		else {
			System.out.println("The two string are different by length.");
		}
		
	}
	
	static boolean isValid(String input){
		if (input.equals("")) {	
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
