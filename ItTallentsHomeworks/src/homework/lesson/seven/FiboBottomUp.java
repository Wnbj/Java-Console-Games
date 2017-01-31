package homework.lesson.seven;

import java.util.Scanner;

public class FiboBottomUp {
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt() + 1;
			System.out.println(fibBU(input));
		
	}
		
		static public int fibBU(int x) {
			int fib[] = new int[x + 1];
			fib[0] = 0;
			fib[1] = 1;
			
			for (int i = 2; i < x + 1; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			return fib[x - 1];
		}
		
}
