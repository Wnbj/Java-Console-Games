package homework.lesson.five;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int size = scan.nextInt();
		int[][] table = new int[size][size];
		
		System.out.printf("Enter %d integer numbers: ", size * size);
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if (i == j) {
					System.out.print(table[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if (i + j == table.length - 1) {
					System.out.print(table[i][j] + " ");
				}
			}
		}
		
	}
}
