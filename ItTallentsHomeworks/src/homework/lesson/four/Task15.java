package homework.lesson.four;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of the array: ");
		int length = scan.nextInt();
		double[] nums = new double[length];

		System.out.printf("Please enter %d integer numbers separate by space: ", length);

		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextDouble();
			if (nums[i] < 0.0f) {
				nums[i] = 0.0f - nums[i];
			}
		}
		double min = nums[0];
		int position = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < min) {
					min = nums[j];
					position = j;
				}
			}
			double temp = nums[i];
			nums[i] = nums[position];
			nums[position] = temp;
			min = nums[i + 1];
			position = i + 1;
		}

		for (int i = nums.length - 3; i < nums.length; i++) {
			if (i == nums.length - 1) {
				System.out.print(nums[i]);
				break;
			}
			System.out.print(nums[i] + "; ");
		}

	}
}
