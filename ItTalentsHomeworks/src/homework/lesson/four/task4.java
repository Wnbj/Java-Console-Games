package homework.lesson.four;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();			
		int[] numbers = new int[length];
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
				
		for (int i = 0; i < length; i++) {			
			numbers[i] = scan.nextInt();
		}
		boolean isMirrorArr = false;

		if (numbers.length == 1) {
			isMirrorArr = true;
		} 
		else {
			
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == numbers[numbers.length - 1 - i]) {
					isMirrorArr = true;
				} 
				else {
					isMirrorArr = false;
					break;
				}
			}
		}
		if (isMirrorArr) {
			System.out.println("It is mirror array.");
		}
		else {
			System.out.println("It is not mirror array.");
		}
	}
	
}
