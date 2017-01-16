package tasks.arrays;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] array = new int[length];
		int count = 0;
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
					array[i] = scan.nextInt();			
		}
		
		for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					temp = array[count];
					array[count] = array[i];
					array[i] = temp;
					count++;
				}
		}

		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
