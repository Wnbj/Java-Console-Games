package homework.lesson.seven;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 integer numbers separate by space:");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		System.out.println("The multiplication of the numbers is " + multiply(firstNum, secondNum));
		
	}
	
	static int multiply(int firstNum, int secondNum){
		
		if (secondNum == 1) {
			return firstNum;
		}
		
		return firstNum + multiply(firstNum, secondNum - 1);
		
	}
	
}
