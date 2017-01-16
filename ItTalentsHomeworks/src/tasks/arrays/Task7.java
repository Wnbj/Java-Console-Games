package tasks.arrays;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matrix = new int[m][n];
		int result = 1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 1; i < matrix[1].length; i++) {
			result *= matrix[i][i-1];
		}
		
		System.out.println(result);
	}
}
