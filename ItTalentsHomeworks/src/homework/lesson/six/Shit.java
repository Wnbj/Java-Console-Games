package homework.lesson.six;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shit {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scan.nextLine().trim();
		int sum = 0;

		Pattern patt = Pattern.compile("-?\\d+");
		Matcher match = patt.matcher(input);

		while (match.find()) {
			sum += Integer.valueOf(match.group());
			System.out.println(match.group());
		}
		System.out.println("The sum is " + sum);
	}
}
