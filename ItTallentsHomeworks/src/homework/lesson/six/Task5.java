package homework.lesson.six;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String firstText = null;
		String secondText = null;
		int spaces = 0;
		
		do {
			System.out.println("Please enter 2 strings without space:");
			firstText = scan.nextLine();
			secondText = scan.nextLine();
		} while (!isValid(firstText) || !isValid(secondText));
		
		if (isEqualSymbols(firstText, secondText) != -1) {
			spaces = getShorterStr(firstText, secondText).indexOf(getLongerStr(firstText, secondText).charAt(isEqualSymbols(firstText, secondText)));
		}
		
		if (isEqualSymbols(firstText, secondText) != -1) {
			for (int i = 0; i < getLongerStr(firstText, secondText).length(); i++) {
				
				if (isEqualSymbols(firstText, secondText) != i) {
					for (int j = 0; j < spaces; j++) {
						System.out.print(" ");
					}
					
					System.out.println(getLongerStr(firstText, secondText).charAt(i));
				}
				else{
					System.out.println(getShorterStr(firstText, secondText));
				}
								
			}
		}
		else {
			System.out.println("There a re no equal symbols.");
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
	
	static int isEqualSymbols(String firstStr, String secondStr){
		
		for (int i = 0; i < getLongerStr(firstStr, secondStr).length(); i++) {
			
			
			if (getShorterStr(firstStr, secondStr).indexOf(getLongerStr(firstStr, secondStr).charAt(i)) > -1) {
				return i ;
			}
		}
		return -1;
		
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
