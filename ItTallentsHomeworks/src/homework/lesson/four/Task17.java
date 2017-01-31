package homework.lesson.four;

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		
		int length = scan.nextInt();
		int[] nums = new int[length];
		System.out.printf("Please enter %d integer numbers separate by space: ", length);
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		boolean isJagged = true;
		for (int i = 1; i < nums.length - 1; i++) {
			if (i % 2 != 0 && !((nums[i] > nums[i - 1]) && nums[i] > nums[i + 1])) {
				
				isJagged = false;
				break;
			}
		}
		System.out.println(isJagged ? "The array is jagged." : "The array is not jagged.");
		
	}
}
