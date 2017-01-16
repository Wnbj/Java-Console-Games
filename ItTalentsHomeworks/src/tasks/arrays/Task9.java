package tasks.arrays;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matrix = new int[m][n];
		int sum = 0;
		int bestSum = 0;
		int startIndex[] = new int[2];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[1].length - 1; j++) {
				sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
				if (sum > bestSum) {
					bestSum = sum;
					startIndex[0] = i;
					startIndex[1] = j;
				}
				sum = 0;
			}
		}
		
		System.out.printf("%d %d%n%d %d", 
				matrix[startIndex[0]][startIndex[1]], 
				matrix[startIndex[0]][startIndex[1] + 1],
				matrix[startIndex[0]+1][startIndex[1]],
				matrix[startIndex[0]+1][startIndex[1]+1]);
		
	}
}
