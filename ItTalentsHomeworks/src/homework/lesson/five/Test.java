package homework.lesson.five;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string1 = " ";
		String string2 =  " ";
		do {
			System.out.println("Enter string 1 only from words");
			string1 = sc.nextLine();
		} while (isValid(string1) == false);

		do {
		System.out.println("Enter string 2 only from words");
		string2 = sc.nextLine();
		} while (isValid(string2) == false);

		System.out.print(string1.toUpperCase() + " " + string1.toLowerCase());
		System.out.print(" " + string2.toUpperCase() + " " + string2.toLowerCase());
		
	}
	
	public static boolean isValid(String input) {
		if (input == null) {
			return false;
		}
		if (input.length() > 40) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (Character.isAlphabetic(input.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}
	
}
