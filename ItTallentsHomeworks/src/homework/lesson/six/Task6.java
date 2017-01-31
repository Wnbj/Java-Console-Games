package homework.lesson.six;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = null;;
		StringBuilder sBuilder = new StringBuilder();
		
		do {
			System.out.println("Please enter a sentence:");
			input = scan.nextLine().trim();
		} while (!isValid(input));
		
		String[] words = input.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			
			sBuilder.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
			sBuilder.append(" ");
		}
		
		System.out.println(sBuilder);
	}
	
	static boolean isValid(String input){
		if (input.equals("")) {	
			return false;
		}		
		return true;
	}
	
}
