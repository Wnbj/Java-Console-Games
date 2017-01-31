package homework.lesson.six;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		String firstText = null;
		String secondText = null;
				
		do {
			System.out.println("Please enter 2 strings up to 40 characters each:");
			String names = scan.nextLine();
			firstText = names.split(",")[0].trim();
			secondText = names.split(",")[1].trim();
		} while (!isValid(firstText) || !isValid(secondText));
		
		printNameWithBiggerSum(firstText, secondText);
		
	}
	
	static boolean isValid(String input){
		if (input.equals("")) {	
			return false;
		}			
		return true;
	}
	
	static String getLongerStr(String firstStr, String secondStr){
		if (firstStr.length() >= secondStr.length()) {
			return firstStr;
		}
		return secondStr;
	}
	
	static void printNameWithBiggerSum(String firstText, String secondText){
		
		int firstSum = 0;
		int secondSum = 0;
		
		for (int i = 0; i < getLongerStr(firstText, secondText).length(); i++) {
			if (i < firstText.length()) {
				firstSum += firstText.charAt(i);
			}
			if (i < secondText.length()) {
				secondSum += secondText.charAt(i);
			}
		}
		
		if (firstSum > secondSum) {
			System.out.println(firstText);
		}
		else if (firstSum < secondSum) {
			System.out.println(secondText);
		}
		else {
			System.out.println("Both names are equal by elements ASCII sum.");
		}
		 	
	}
	
}
