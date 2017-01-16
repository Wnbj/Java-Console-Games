package homework.lesson.four;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = 10;
		double[] array = new double[length];
		int index = 1;
		
		System.out.print("Please enter 10 floating point numbers separate by space: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= -0.231f) {
				array[i] =  ((index * index) + 41.25f);
			} else {
				array[i] =  index * array[i];
			}
			index++;
		}

		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.printf("%.2f, ", array[i]);
			} 
			else {
				System.out.printf("%.2f", array[i]);
			}
		}
		
	}
}
