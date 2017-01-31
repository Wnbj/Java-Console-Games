package homework.lesson.seven;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number:");
		int input = scan.nextInt();
		int reversedNums = reverseNumber(input);
		
		System.out.println(reversedNums);
		if (input == reversedNums) {
			System.out.println("The number is a palidrom.");
		}
		else{
			System.out.println("The number is not a palidrom.");
		}
				
	}
	
	static int reverseNumber(int number){
		
	    if (number == 0)
	        return 0;

	    int n = number;
	    int pow = 1;

	    while (n >= 10)
	    {
	        n = n / 10;
	        pow = pow * 10;
	    }
	    return (n + reverseNumber(number - n*pow)*10);
	}
	
	
	
}
