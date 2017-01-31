package tasks.arrays;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matrix = new int[m][n];
		int sum = 0;
		int bestSum = 0;
		int bestRow = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
			if(sum > bestSum){
				bestSum = sum;
				bestRow = i;
			}
			sum = 0;
		}
		
		System.out.println(bestSum);
		System.out.println(bestRow);
		
	}
}
