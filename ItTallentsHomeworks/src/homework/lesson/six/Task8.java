package homework.lesson.six;

import java.util.Scanner;

public class Task8 {
	public static void main(String args[])
	   {
	      
	      Scanner scan = new Scanner(System.in);
	      String original = "";
	      String reverse = "";
	      
	      do {
				System.out.println("Enter a string to check if it is a palindrome:");
				original = scan.nextLine().trim();
			} while (!isValid(original));

	      for ( int i = original.length() - 1; i >= 0; i-- ){
	         reverse += original.charAt(i);
	      }
	      
	      if (original.equals(reverse)){
	         System.out.println("Entered string is a palindrome.");
	      }
	      else{
	         System.out.println("Entered string is not a palindrome.");
	      }	 
	   }
	
	static boolean isValid(String input){
		if (input.equals("")) {	
			return false;
		}		
		return true;
	}
	
}
