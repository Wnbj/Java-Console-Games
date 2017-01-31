package homework.lesson.seven;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		do {
			input = scan.nextInt();
		} while (input <= 0);
		
		long[] memo = new long[input];
		long nFiboNum = (fibo(input, memo));
		
		System.out.printf("The first %d fibonacci numbers are: ", input);
		for (long num : memo) {
			System.out.print(num + " ");
		}
		
		
	}
	
	static long fibo(int n, long[] memo){
		
		if (n == 1 || n ==2) {
			memo[n - 1] = 1;
		}
		
		if (memo[n - 1] == 0) {
			memo[n - 1] = fibo(n - 1, memo) + fibo(n - 2, memo);
		}
		return memo[n - 1];
	}
	
}
