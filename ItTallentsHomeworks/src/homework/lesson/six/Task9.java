package homework.lesson.six;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String input = "";
	    int sum = 0;
	      
	      do {
				System.out.println("Enter a string:");
				input = scan.nextLine().trim();
			} while (!isValid(input));
	      
	      Pattern patt = Pattern.compile("-?\\d+");
	      Matcher match = patt.matcher(input);
	      
	      while (match.find()) {
			sum += Integer.valueOf(match.group());
			System.out.println(match.group());
		}
	      System.out.println("The sum is " + sum);
	}
	
	static boolean isValid(String input){
		if (input.equals("")) {	
			return false;
		}		
		return true;
	}
}
