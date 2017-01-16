package homework.lesson.three;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two integer numbers separate by space: ");
		
		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int temp = 0;
		int sum = 0;
		
		if (numOne > numTwo) {
			temp = numOne;
			numOne = numTwo;
			numTwo = temp;
		}
		
		for (int i = numOne; i <= numTwo; i++) {
			if (i * i % 3 == 0) {
				System.out.printf("skip %d,", i * i);
				continue;
			}
			
			System.out.print(i * i);
			sum += i * i;
			
			if (i == numTwo || sum > 200) {
				break;
			}
			
			System.out.print(',');				
		}
		
	}
}
